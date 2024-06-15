
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h2 {
                color: #407A79;
            }
            .form-item {
              display: flex;
              align-items: center;
              margin-bottom: 10px;
            }

            .form-item label {
              min-width: 180px;
              margin-right: 10px;
            }

            input[type="text"],
            input[type="email"],
            select,
            textarea {
              width: 30%;
              margin-bottom: 5px;
            }

            input[type="radio"],
            input[type="checkbox"] {
              margin-right: 5px;
            }

            .checkbox-group {
              display: flex;
              flex-direction: column;
              align-items: flex-start;
            }

            .buttons {
              gap: 2rem;
            }
        </style>
    </head>
    
    
    <h2>Join our email list </h2>
        <form method ="post" action="./EmailServlet">
            <h4>
              To join our email list, enter your name and email address below.
            </h4>
            <div class="form-item">
              <label for="email">Email:</label>
              <input type="email" id="email" name="email" required />
            </div>
            <div class="form-item">
                <label for="name">First name:</label>
                <input type="text" id="first" name="first" required />
            </div>
            <div class="form-item">
                <label for="name">Last name:</label>
                <input type="text" id="last" name="last" required />
            </div>
            <div class="form-item buttons">
                <input type="submit" value="Join Now" />
            </div>
            
        </form>
  
    
</html>
