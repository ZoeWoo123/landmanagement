package com.opendoors.landmanagement.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.*;

import com.opendoors.landmanagement.service.UserService;
import com.opendoors.landmanagement.domain.Contract;
import com.opendoors.landmanagement.domain.Owner;
import com.opendoors.landmanagement.domain.OwnerForTemp;
import com.opendoors.landmanagement.utils.PDFTemplateUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    private Contract outputContract = new Contract();
    private Owner owner = new Owner();

    @GetMapping(value = "/")
    public String showIndex(Model model, HttpServletRequest request) {
        
       
        return "index";
    }
 
    @PostMapping(value = "/")
    public String submitIndex(Model model, HttpServletRequest request, @ModelAttribute("seqNbr") String seqNbr) {        
        try {
            owner = userService.getUserBySeqNbr(seqNbr);
            System.out.println("name" + owner.getFullName());
            return "redirect:/contract";
        } catch (Exception ex) {
            // log exception first, 
            // then show error
            String errorMessage = ex.getMessage();            
            // logger.error(errorMessage);
            model.addAttribute("errorMessage", errorMessage);
            return "index";
        }        
    }

    @GetMapping(value = "/form")
    public String showForm(Model model, HttpServletRequest request) {
        return "form";
    }

    @GetMapping(value = "/contract")
    public String createContract(Model model, HttpServletRequest request) {
        
        return "contractMaker";
    }
    @PostMapping(value = "/contract")
    public String submitForm(Model model, HttpServletRequest request, @ModelAttribute("contract") Contract contract) {
        outputContract = new Contract(contract);
        //return "redirect:/pdfpreview";
        return "redirect:/pdf";
    }
    // @PostMapping(value = "/form")
    // public String submitForm(Model model, HttpServletRequest request, @ModelAttribute("user") User user, @RequestParam("status") String status) {        
    //     try {
    //         String host = request.getHeader("host");
    //         if(host.indexOf(".") < 0){
    //             name = "local";
    //         }else{
    //             name = host.substring(0, host.indexOf("."));
    //         }
    //         user.setName(name);
    //         user.setStatus(status);
    //         userService.checkUser(user);
    //         return "redirect:/thank";
    //     } catch (Exception ex) {
    //         // log exception first, 
    //         // then show error
    //         String errorMessage = ex.getMessage();            
    //         // logger.error(errorMessage);
    //         model.addAttribute("errorMessage", errorMessage);
    //         return "form";
    //     }        
    // }

    @GetMapping(value = {"/thank"})
    public String showThankYou(Model model) {
        return "thank";
    }

    // @GetMapping(value = {"/test"})
    // public String showTestFile(Model model, HttpServletRequest request){
    //     String host = request.getHeader("host");
    //     if(host.indexOf(".") < 0){
    //         name = "local";
    //     }else{
    //         name = host.substring(0, host.indexOf("."));
    //     }
    //     model.addAttribute("name", this.name);
    //     return "testfile";
    // }
    @GetMapping(value = {"/pdfpreview"})
    public String showPdf(Model model) {
        model.addAttribute("date", java.time.LocalDate.now());
        model.addAttribute("contract", outputContract);
        model.addAttribute("owner", owner);
        return "testfile";
    }

    @RequestMapping("/pdf")
	public String exportPdf(HttpServletResponse response, HttpServletRequest request) throws Exception{
		ByteArrayOutputStream baos = null;
		OutputStream out = null;
        OwnerForTemp oft = new OwnerForTemp(owner.getFullName(), owner.getStreetAddress(), owner.getSalutation(), owner.getParcelAcreage(),owner.getCityStateZip());
        System.out.println(oft.getFullname());
		try {
			// The data in the template, the actual application from the database query
			Map<String, Object> data = new HashMap<>();

            // String host = request.getHeader("host");
            // String name = host.substring(0, host.indexOf("."));
            data.put("date", java.time.LocalDate.now());
			data.put("contract", outputContract);
            data.put("oft", oft);
			
			// List<PDFDataTest> detailList = new ArrayList<>();
			// detailList.add(new PDFDataTest(123456,"test","test","test","test"));
			// detailList.add(new PDFDataTest(111111,"test","test","test","test"));
			// detailList.add(new PDFDataTest(222222,"test","test","test","test"));
			// data.put("detailList", detailList);
			
			baos = PDFTemplateUtil.createPDF(data, "testfile.ftlh");
			// Set the response message header to tell the browser that the current response is a download file
			response.setContentType( "application/x-msdownload");
			// Tell the browser that the current response data requires user intervention to save to the file, and what the file name is. If the file name has Chinese, it must be URL encoded. 
			String fileName = URLEncoder.encode("Contract.pdf", "UTF-8"); 
			response.setHeader( "Content-Disposition", "attachment;filename=" + fileName);
			out = response.getOutputStream();
			baos.writeTo(out);
			baos.close();
		} catch (Exception e) {
			e.printStackTrace();
		    throw new Exception("Export failed:" + e.getMessage());
		} finally{
			if(baos != null){
				baos.close();
			}
			if(out != null){
				out.close();
			}
		}
        return "testfile";
	}

}
