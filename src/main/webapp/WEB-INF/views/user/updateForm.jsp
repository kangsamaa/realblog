<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container p-4 w-25 bg-light rounded shadow">
  <h5 style="font-family: 'IBM Plex Sans KR', sans-serif; margin-bottom: 30px;">회원정보</h5>
  <form>
    <div class="form-group">
      <input type="text" class="form-control" placeholder="Enter username" required="required" maxlength="20" readonly="readonly">
    </div>
    <div class="form-group">
      <input type="password" class="form-control"  placeholder="Enter password" required="required" maxlength="20">
    </div>
    <div class="form-group">
      <input type="email" class="form-control" placeholder="Enter email">
    </div>
    <button type="submit" class="btn btn-primary col-md-4" style="margin-top: 30px;">회원정보수정</button>
  </form>
</div>
<%@ include file="../layout/footer.jsp"%>