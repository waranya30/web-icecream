<%-- 
    Document   : addNewicecreamSuccess
    Created on : Aug 16, 2023, 1:32:07 PM
    Author     : admin
--%>
<%@page import="java.util.Arrays"%>
<%@page import="model.Ice"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<title>เพิ่มเมนูสำเร็จ</title>
<h2>เพิ่มเมนูสำเร็จ</h2>
<%
    Ice ice = (Ice) session.getAttribute("ice");
%>
วันที่:<p id="demo"></p> <td><script> document.getElementById("demo").innerHTML = Date();</script></td>
ชื่อ: <%= ice.getName() %><br/>
ประเภท: <%= ice.getType() %><br/>
โรยหน้า: <%= Arrays.toString(ice.getYummy()) %><br/>
ท๊อปปิ้ง: <%= ice.getToping() %><br/>
ราคา: <%= ice.getPrice() %></b> บาท<br/><br/>
<a href="updateIcecream.jsp"> แก้ไขเมนู </a><br>
<a href="index.html"> หน้าหลัก</a><br>
</table>
