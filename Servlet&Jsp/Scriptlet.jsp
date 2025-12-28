<html>
<body>
<h1>HEllo this is Scriptlet</h1>
<br>
<%for(int i=1;i<=7;i++){
	out.println("<br> learning java and one day i will become java dev: "+i);
}%>

<br>
<%! String met2(String name1){
	 return name1.toUpperCase();
	
	
	}%>
	
<br>
result of 2nd method: <%= met2("anJUYTT") %>

</body>
</html>