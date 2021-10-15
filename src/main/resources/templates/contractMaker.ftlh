<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Welcome</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body style="background-color:#19875440;">
        <div class="px-5 pt-2 my-5" >
            <h3>Make Your Contract</h3>
            
            <form class="ml-5" action="/contract" name="contract" method="POST">
                <div>
                    <h4>Greeting</h4>
                    <textarea id="greeting" name="greeting" rows="4" cols="100" value=${(contract.greeting)!''}>
I hope you and your family are well and that you find this letter the good news that I believe it is.
                    </textarea>
                    <h4>background</h4>
                    <textarea id="background" name="background" rows="4" cols="100" value=${(contract.background)!''}>
For background, I have been in the energy, water and real estate business since 2004. I started Open Doors Management because I know how to identify land that can host solar, wind and energy storage systems. Additionally, my business network includes top-tier energy development companies who are now considering my land listings. I am asking you to sign the listing agreement at the end of this letter so I can offer your land to the energy development industry. 
                    </textarea>
                    <h4>Why your property?</h4>
                    <textarea id="whyyourproperty" name="whyyourproperty" rows="4" cols="100" value=${(contract.whyyourproperty)!''}>
My firm has developed a comprehensive software system to identify property like yours situated near an electrical substation, the onramp to the electrical grid serving business and residents like you. This is the property we have identified together with the substation:
                    </textarea>
                    <h4>Our offer</h4>
                    <textarea id="ouroffer" name="ouroffer" rows="4" cols="100" value=${(contract.ouroffer)!''}>
You can expect anywhere from $400 to $900 per acre, per year over a 20 year period with an escalator for leasing your land. If you wish to sell your land, you can expect to obtain Fair Market Value.
                    </textarea>
                    <h4>Our job</h4>
                    <textarea id="ourjob" name="ourjob" rows="4" cols="100" value=${(contract.ourjob)!''}>
My job is to represent your property to the many qualified energy developers who are developing in Colorado.
                    </textarea>
                    <h4>Regarding Agreement</h4>
                    <textarea id="regardingagreement" name="regardingagreement" rows="4" cols="100" value=${(contract.regardingagreement)!''}>
Please text me at 858-342-1415 with a photo of your signed agreement if you will sign it. If you will not sign it because you want to discuss it or propose a change, please call me. Please text me if you do not want to go forward for any reason so we know where you stand. If you would like to propose a change, please call me to discuss.
                    </textarea>
                </div>
                <input class="btn btn-primary mt-3" type="submit" value="Create contract">
            </form>
            <br/>

            <#if errorMessage?has_content>
                <div class="error text-danger ml-5">${errorMessage}</div>
            </#if> 
            
        </div>
    </body>
</html>