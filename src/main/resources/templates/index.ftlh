<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Welcome</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body style="background-color:#19875440;">
        <div class="px-4 pt-5 my-5" >
            <h1 class="display-1 text-center">Welcome!</h1>
            <div class="border shadow-lg px-5 py-3 my-5 mx-auto col-lg-4 col-md-8" style="background-color:#dee2e6c7;">
                <form class="ml-5" action="/" name="seqNbr" method="POST">
                    <div class="my-3">
                        <h3>Please enter seqNbr to create contract </h3>
                        <input type="text" class="form-control" seqNbr="seqNbr"  name="seqNbr" value="${(seqNbr)!''}" />
                    </div>
                    <input class="btn btn-primary mt-3" type="submit" value="Start">
                </form>
                <br/>

                <#if errorMessage?has_content>
                    <div class="error text-danger ml-5">${errorMessage}</div>
                </#if> 
            </div>    
        </div>
    </body>
</html>