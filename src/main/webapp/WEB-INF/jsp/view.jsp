<%--
  Created by IntelliJ IDEA.
  User: ThinKPad
  Date: 2017/7/2
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body bgcolor="affff">
<!--定义按键表格,每个按键对应一个事件触发-->
<
<form action="${pageContext.request.contextPath}/user/cal" method="post">
    <table border="1" align="center" bgColor="#bbff77"
           style="height: 350px; width: 270px">
        <tr>
            <td colspan="4">
                <input type="text" id="nummessege" name="nummessege" value="${res}"
                       style="height: 90px; width: 350px; font-size: 50px"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="1" id="1" onclick="onclicknum(1)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="2" id="2" onclick="onclicknum(2)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="3" id="3" onclick="onclicknum(3)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="+" id="add" onclick="onclicknum('+')"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="4" id="4" onclick="onclicknum(4)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="5" id="5" onclick="onclicknum(5)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="6" id="6" onclick="onclicknum(6)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="-" id="sub" onclick="onclicknum('-')"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
        </tr>
        <tr>
            <td>
                <input type="button" value="7" id="7" onclick="onclicknum(7)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="8" id="8" onclick="onclicknum(8)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="9" id="9" onclick="onclicknum(9)"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="*" id="mul" onclick="onclicknum('*')"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="button" value="0" id="0" onclick="onclicknum(0)"
                       style="height: 70px; width: 190px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="." id="point" onclick="onclicknum('.')"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
            <td>
                <input type="button" value="/" id="division"
                       onclick="onclicknum('/')"
                       style="height: 70px; width: 90px; font-size: 35px">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="button" value="Del" id="clear"
                       onclick="onclickclear()"
                       style="height: 70px; width: 190px; font-size: 35px"/>
            </td>
            <td colspan="2">
                <button><input type="submit" value="=" id="result"
                               style="height: 70px; width: 190px; font-size: 35px"/></button>
            </td>

        </tr>

    </table>
</form>
</body>
<script type="text/javascript">
    var numresult;
    var str;
    function onclicknum(nums) {
        str = document.getElementById("nummessege");
        str.value = str.value  + nums + " ";

    }
    function onclickclear() {
        str = document.getElementById("nummessege");
        str.value = "";
    }
    /*
     function onclickresult() {
     str = document.getElementById("nummessege");
     //            numresult = eval(str.value);
     //            str.value = numresult;
     var postUrl = "*/
    <%-- ${pageContext.request.contextPath}/user/cal";//提交地址--%>
    /*    var ExportForm = document.createElement("FORM");
     document.body.appendChild(ExportForm);
     ExportForm.method = "POST";
     var newElement = str;
     newElement.setAttribute("name", "res");
     newElement.setAttribute("type", "hidden");
     ExportForm.appendChild(newElement);
     newElement.value = newElement;
     ExportForm.action = postUrl;
     //            ExportForm.target = "_blank";
     ExportForm.submit();
     document.body.removeChild(ExportForm);
     }*/
</script>
</html>