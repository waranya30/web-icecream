<%-- 
    Document   : addNewicecream
    Created on : Aug 16, 2023, 1:31:01 PM
    Author     : admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<title>เพิ่มเมนูไอศกรีม</title>
<h2>เพิ่มเมนูไอศกรีม</h2>
<form action="AddNewIceMySQL">
    <table>
          <tr><td>วันที่:</td><td><p id="demo"></p>
        <script>
                document.getElementById("demo").innerHTML = Date();
        </script>
        <tr><td>ชื่อ:</td><td><input type="text" name="iceName"></td>
        <tr><td>ประเภท:</td>
            <td>
                <select name="iceType">
                    <option value="ถ้วย">ถ้วย</option>
                    <option value="ขนมปัง">ขนมปัง</option>
                    <option value="โคน">โคน</option>  
                </select>
            </td>
        </tr>
        <tr><td>โรยหน้า:</td>
            <td>
                <input type="checkbox" name="yummy" value="เยลลี่แอปเปิ้ลเขียว">เยลลี่แอปเปิ้ลเขียว
                <input type="checkbox" name="yummy" value="เยลลี่แคนตาลูป">เยลลี่แคนตาลูป<br>
                <input type="checkbox" name="yummy" value="เยลลี่องุ่น">เยลลี่องุ่น
                <input type="checkbox" name="yummy" value="เรนโบว์">เรนโบว์<br>
            </td>
        </tr>
        <tr><td>ท๊อปปิ้ง:</td>
            <td>
                <input type="radio" name="toping" value="สตอเบอร์รี่">สตอเบอร์รี่
                <input type="radio" name="toping" value="ช๊อคโกแลต">ช๊อคโกแลต
                <input type="radio" name="toping" value="บลูเบอรี่">บลูเบอรี่
            </td>
        </tr>
        <tr><td>ราคา:</td><td><input type="text" name="price"></b> บาท<br/></td></tr>
        <tr><td>&nbsp;</td><td><input type="submit" value="เพิ่มเมนู"></td></tr>
    </table>
</form>


