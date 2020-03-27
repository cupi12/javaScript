<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>글 번호</td>
<td>내 용</td>
<td>작성자</td>
<td>작성일시</td>
<input type="text" id="num"></input>
<input type="text" id="content"></input>
<input type="text" id="people"></input>
<button onclick="submit()">추가</button>
</tr>
</table>
	<script>
	function submit(){
		var $tr, $td, $text;
		var $tbl=document.createElement("table");
		
		$tr.document.CreateElement("tr");
		
		$td.document.CreateElement("td");
		$text.document.CreateTextNode("text");
		$td.document.appendChild($text);
		$tr.document.appendChild($td);
		
	
	}
	</script>
</body>
</html>