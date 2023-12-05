<jsp:include page="../include/header.jsp"/>
<section>
<div class="bg-light2 pt-5 pb-5">
<div class="row">
<div class="col-12 text-center">
<h1 class="m-0">Employee Form</h1>
</div>
</div>
</div>
</section>

<section class="pt-5 pb-5">
<div class="container">
<form method="get" action="/employee/createSubmit">
<div class="mb-3">
    <label for="firstname" class="form-label">First Name:</label>
    <input type="text" class="form-control" id="firstname" name="firstname" required>
    <div id="firstNameHelp" class="form-text">Please let us know your first name</div>
     </div>
     <div class="mb-3">
    <label for="lastname" class="form-text">Last Name</label>
    <input type="text" class="form-control" id="lastname" name="lastname" required>
    </div>
    <div class="mb-3">
  <label for="departmentname" class="form-label">Department Name</label>
    <input type="text" class="form-control" id="departmentname"name="departmentname" required>
    </div>
    <button type="submit" class="btn-primary">Submit</button>
</form>
</div>
</section>
<jsp:include page="../include/footer.jsp"/>
