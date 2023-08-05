<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!-- 방법1 -->
<script>
  location.href="/board";
</script>
<!-- 방법2 -->
<%
  response.sendRedirect("/board?page=0");
  //request.getRequestDispatcher("/board?page=0").forward(request, response);
%>