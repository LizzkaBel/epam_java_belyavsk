<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>First Server</title>
  </head>
  <body>
  <form action="controller" method="post">
    <input type="text" name="firstNumber" value="" style="width: 50px" />
    +
    <input type="text" name="secondNumber" value="" style="width: 50px" />
    =
    <input type="submit" name="exec" value="Compute" />
  </form>

  </body>
</html>
