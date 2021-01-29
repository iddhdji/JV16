<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<% 
String logout =request.getParameter("logout");
if(logout != null){
session.removeAttribute("login_name");
}
String session_name =(String)session.getAttribute("login_name");
if(session_name != null){
response.sendRedirect("syouhin_main.jsp");
}
 %>
<!DOCTYPE html>

<html>

  <head>
    <meta charset="utf-8">
    <title>ログインページ</title>
  </head>
  <body>
<h1>商品管理　ログイン</h1>
    <form action="syouhin_index_action.jsp" method="post">
   <table border="1">
   <tr>
      <td>会員ＩＤ</td>
      <td><input type="text" name="id" size="50" maxlength"20"></td>　　　　　
   </tr>
   <tr>
   <td>パスワード</td>
   <td><input type="text" name="pas" size="50" maxlength"20"></td>
   </tr>
      <td colspan="2" align="center">
      <input type="submit" value="ログイン">
      </td>
      </table>
    </form>
    
  </body>
</html>