<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- tag lib  -->
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- end tag lib  -->
<%
	String contextPath = request.getContextPath();// or page Context
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login area</title>
<link rel="dns-prefetch" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600"
	rel="stylesheet" type="text/css">

<link rel="stylesheet" href="css/style.css">

<link rel="icon" href="Favicon.png">
<link rel="shortcut icon"
	href="<%=contextPath %>/resources/ClientTemplate/images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon"
	href="<%=contextPath %>/resources/ClientTemplate/images/apple-touch-icon.png">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="<%=contextPath %>/resources/ClientTemplate/css/bootstrap.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="<%=contextPath %>/resources/ClientTemplate/css/style.css">
<!-- Responsive CSS -->
<link rel="stylesheet"
	href="<%=contextPath %>/resources/ClientTemplate/css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="<%=contextPath %>/resources/ClientTemplate/css/custom.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=contextPath %>/resources/custom.css">
</head>
<body>
	<header class="top-navbar">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container">
				<a class="navbar-brand" href="index.html"> <img
					src="<%=contextPath %>/resources/ClientTemplate/images/logo.png" alt="" />
				</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbars-rs-food" aria-controls="navbars-rs-food"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbars-rs-food">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item active"><a class="nav-link"
							href="index.html">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="menu">Menu</a></li>
						<li class="nav-item"><a class="nav-link" href="about.html">About</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="dropdown-a"
							data-toggle="dropdown">Pages</a>
							<div class="dropdown-menu" aria-labelledby="dropdown-a">
								<a class="dropdown-item" href="reservation.html">Reservation</a>
								<a class="dropdown-item" href="stuff.html">Stuff</a> <a
									class="dropdown-item" href="gallery.html">Gallery</a>
							</div></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="dropdown-a"
							data-toggle="dropdown">Blog</a>
							<div class="dropdown-menu" aria-labelledby="dropdown-a">
								<a class="dropdown-item" href="blog.html">blog</a> <a
									class="dropdown-item" href="blog-details.html">blog Single</a>
							</div></li>
						<li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->



	<div class="row" style="margin-top: 20px">
		<div class=" col-md-6 col-sm-offset-2 col-md-offset-3">
			<form:form modelAttribute="sendData" action="createPost" method="post"
				role="form" enctype="multipart/form-data">
				<fieldset>
					<h2>Create Post Form</h2>
					<hr class="colorgraph">

					<!-- input title pid hidden -->
					<div class="form-group">
						<form:input type="text" path="pid" id="pid"
							class="form-control input-lg" readonly="true" />
					</div>
					<!-- end input pid hidden  -->

					<!-- input title  -->
					<div class="form-group">
						<form:input type="text" path="title" id="title"
							class="form-control input-lg"
							placeholder="Please enter title your Post" />
					</div>
					<!-- end input title  -->

					<!-- input byname  -->
					<div class="form-group">
						<form:input type="text" path="byname" id="byname"
							class="form-control input-lg"
							placeholder="Please enter title your byname" />
					</div>
					<!-- end input byname  -->

					<!-- input regdate hidden  -->
					<div class="form-group">
						<form:input type="hidden" path="regdate" id="regdate"
							class="form-control input-lg" />
					</div>
					<!-- end input regdate hidden  -->

					<!-- input visible hidden  -->
					<div class="form-group">
						<form:input type="hidden" path="regdate" id="regdate"
							class="form-control input-lg" />
					</div>
					<!-- end input visible hidden  -->

					<!-- input content textarea  -->
					<div class="form-group">
						<form:textarea path="content" style=" height: 200px;" id="content" />
					</div>
					<!-- end input content textarea  -->

					<!-- input tagid select  -->
					<div class="form-group">
						<form:select path="tagid">
							<form:option value="" label="--Please Select"></form:option>
							<!-- <option selected="selected" value="">--Please Select</option> -->
							<form:options items="${ListTag}" itemValue="tagid"
								itemLabel="tgname" />
						</form:select>
					</div>
					<!-- end input tagid select  -->

					<!-- input img file  -->
					<div class="form-group">
						<input type="file" name="up_photo" onchange="openFile(this)"
							class="form-control" placeholder="please select your image" />
						<form:hidden path="img" />
						<div id="sure"></div>
					</div>
					<!-- end input img file  -->
					<span class="button-checkbox">
						<button type="button" class="btn" data-color="info">Remember
							Me</button> <input type="checkbox" name="remember_me" id="remember_me"
						checked="checked" class="hidden"> <a href=""
						class="btn btn-link pull-right">Forgot Password?</a>
					</span>
					<hr class="colorgraph">
					<div class="row">
						<div class="col-xs-6 col-sm-6 col-md-6">
							<input type="submit" class="btn btn-lg btn-success btn-block"
								value="Sign In">
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<a href="" class="btn btn-lg btn-primary btn-block">Upload</a>
						</div>
					</div>
				</fieldset>
			</form:form>
		</div>
	</div>



	<!-- Start Footer -->
	<footer class="footer-area bg-f">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<h3>About Us</h3>
					<p>Integer cursus scelerisque ipsum id efficitur. Donec a dui
						fringilla, gravida lorem ac, semper magna. Aenean rhoncus ac
						lectus a interdum. Vivamus semper posuere dui.</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<h3>Subscribe</h3>
					<div class="subscribe_form">
						<form class="subscribe_form">
							<input name="EMAIL" id="subs-email" class="form_input"
								placeholder="Email Address..." type="email">
							<button type="submit" class="submit">SUBSCRIBE</button>
							<div class="clearfix"></div>
						</form>
					</div>
					<ul class="list-inline f-social">
						<li class="list-inline-item"><a href="#"><i
								class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li class="list-inline-item"><a href="#"><i
								class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li class="list-inline-item"><a href="#"><i
								class="fa fa-linkedin" aria-hidden="true"></i></a></li>
						<li class="list-inline-item"><a href="#"><i
								class="fa fa-google-plus" aria-hidden="true"></i></a></li>
						<li class="list-inline-item"><a href="#"><i
								class="fa fa-instagram" aria-hidden="true"></i></a></li>
					</ul>
				</div>
				<div class="col-lg-3 col-md-6">
					<h3>Contact information</h3>
					<p class="lead">Ipsum Street, Lorem Tower, MO, Columbia, 508000</p>
					<p class="lead">
						<a href="#">+01 2000 800 9999</a>
					</p>
					<p>
						<a href="#"> info@admin.com</a>
					</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<h3>Opening hours</h3>
					<p>
						<span class="text-color">Monday: </span>Closed
					</p>
					<p>
						<span class="text-color">Tue-Wed :</span> 9:Am - 10PM
					</p>
					<p>
						<span class="text-color">Thu-Fri :</span> 9:Am - 10PM
					</p>
					<p>
						<span class="text-color">Sat-Sun :</span> 5:PM - 10PM
					</p>
				</div>
			</div>
		</div>

		<div class="copyright">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<p class="company-name">
							All Rights Reserved. &copy; 2018 <a href="#">Live Dinner
								Restaurant</a> Design By : <a href="https://html.design/">html
								design</a>
						</p>
					</div>
				</div>
			</div>
		</div>

	</footer>
	<!-- End Footer -->

	<a href="#" id="back-to-top" title="Back to top" style="display: none;"><i
		class="fa fa-paper-plane-o" aria-hidden="true"></i></a>

	<!-- ALL JS FILES -->
	<script src="<%=contextPath %>/resources/ClientTemplate/js/jquery-3.2.1.min.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/popper.min.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/bootstrap.min.js"></script>
	<!-- ALL PLUGINS -->
	<script src="<%=contextPath %>/resources/ClientTemplate/js/jquery.superslides.min.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/images-loded.min.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/isotope.min.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/baguetteBox.min.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/form-validator.min.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/contact-form-script.js"></script>
	<script src="<%=contextPath %>/resources/ClientTemplate/js/custom.js"></script>
	<!-- external -->
	<script type="text/javascript" src="resources/ckeditor/ckeditor.js"></script>

	<script type="text/javascript">
		var editor = '';
		$(document).ready(function() {
			editor = CKEDITOR.replace('content');
		});
	</script>

	<script>
		var openFile = function(field) {
			var reader = new FileReader();
			reader.onload = function() {
				console.log(reader.result);
				var img = new Image(150, 150);
				img.onload = function() {
					document.getElementById("sure").appendChild(img);
				}
				img.src = reader.result;
			};
			reader.readAsDataURL(field.files[0]);
		};
	</script>




</body>
</html>