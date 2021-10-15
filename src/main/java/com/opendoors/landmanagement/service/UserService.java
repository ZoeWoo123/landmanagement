package com.opendoors.landmanagement.service;

import java.net.URLEncoder;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.opendoors.landmanagement.domain.Owner;
import com.opendoors.landmanagement.domain.PropertyView;
import com.opendoors.landmanagement.domain.User;

import org.springframework.stereotype.Service;


@Service
public class UserService {
    //Field id
    // String idCode = "1000532";
    // String idName = "1000539";
    // String idEmail = "1000533";
    // String idPhone = "1000534";
    // String idStatus = "1000535";
    // String idMessage = "1000536";

    private Gson gson = new Gson();

    String idName = "1000024";
    String idEmail = "1000020";
    // String idStatus = "1000022";
    // String idMessage = "1000023";

    RagicHttpService ragicHttpService = new RagicHttpService();

    public void checkCode(String code) throws Exception {
        if (code == null || code.isEmpty()) {
            throw new Exception("Authentication Code is required");
        }
    }
    public void checkUser(User user) throws Exception {
        if (user.getEmail().isEmpty()) {
            throw new Exception("Email is required");
        }
        else if (user.getPhone().isEmpty()) {
            throw new Exception("Phone Number is required");
        }
        else {
            postUser(user);
        }
        System.out.println(user);
        
    }

    public User getUserByEmail(String email) {
        List<User> list = new ArrayList<>();
        try {
            String url = "https://na3.ragic.com/zoeisdoingsometest/land-management/1";
            String query = "where=" + idEmail + ",eq," + email;
            String json = ragicHttpService.sendGet(url, query);
            System.out.println("json " + json);
            Map<String, User> res = gson.fromJson(json, new TypeToken<Map<String, User>>() {
            }.getType());
            System.out.println("User: " + res.get("3"));
            // JsonObject jsonObj = element.getAsJsonObject();
            res.keySet().stream().forEach(key -> list.add(res.get(key)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("User: " + list.get(0));
        return list.get(0);
    }

    public void postUser(User user){
        String json = userJsonTrans(user);
        String url = "https://na3.ragic.com/zoeisdoingsometest/candidates2/1?v=3&api";
        //String url = "https://www.ragic.com/ozquantum/real-estate/10?v=3&api";
        try{
            System.out.println(ragicHttpService.sendPost(url, json));
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public String userJsonTrans(User user){
        String json = "";
        try{
            json += idName + "=" + URLEncoder.encode(user.getName(), "UTF-8") + "&" + 
                    idEmail + "=" + URLEncoder.encode(user.getEmail(), "UTF-8") + "&";
                    
    
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return json;
    }

    public Owner getUserBySeqNbr(String seqNbr) {
        Owner pv = new Owner();
        try {
            String url = "https://www.ragic.com/ozquantum/real-estate/15";
            String query =  "where=1000850,eq," + seqNbr;
            String json = ragicHttpService.sendGet(url, query);
            Map<Integer, Owner> res = gson.fromJson(json, new TypeToken<Map<Integer, Owner>>() {
            }.getType());
            pv = new ArrayList<Owner>(res.values()).get(0);
            // JsonObject jsonObj = element.getAsJsonObject();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return pv;
    }

}
