<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/layout/header.jsp"%>
<div class="container p-4 w-25 bg-light rounded shadow">
  <h5 style="font-family: 'IBM Plex Sans KR', sans-serif; margin-bottom: 30px;">로그인</h5>
  <form>
    <div class="form-group">
      <input type="text" class="form-control" placeholder="Enter username" required="required">
    </div>
    <div class="form-group">
      <input type="password" class="form-control" placeholder="Enter password" id="pwd" >
    </div> 
    <button type="submit" class="btn btn-primary col-md-4" style="margin-top: 30px;">로그인</button>
  </form>
</div>
<%@ include file="/WEB-INF/layout/footer.jsp"%>