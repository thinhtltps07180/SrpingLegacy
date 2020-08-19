<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	href="resources/ClientTemplate/images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon"
	href="resources/ClientTemplate/images/apple-touch-icon.png">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="resources/ClientTemplate/css/bootstrap.min.css">
<!-- Site CSS -->
<link rel="stylesheet" href="resources/ClientTemplate/css/style.css">
<!-- Responsive CSS -->
<link rel="stylesheet"
	href="resources/ClientTemplate/css/responsive.css">
<!-- Custom CSS -->
<link rel="stylesheet" href="resources/ClientTemplate/css/custom.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/custom.css">
</head>
<body>
	<header class="top-navbar">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container">
				<a class="navbar-brand" href="index.html"> <img
					src="resources/ClientTemplate/images/logo.png" alt="" />
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
			<form action="login" method="post" role="form">
				<fieldset>
					<h2>Please Sign In</h2>
					<hr class="colorgraph">
					<div class="form-group">
						<input type="text" name="username" id="username"
							class="form-control input-lg"
							placeholder="Please enter your User Name">
					</div>
					<div class="form-group">
						<input type="password" name="password" id="password"
							class="form-control input-lg" placeholder="Password">
					</div>
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
							<a href="" class="btn btn-lg btn-primary btn-block">Register</a>
						</div>
					</div>
				</fieldset>
			</form>
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
	<script src="resources/ClientTemplate/js/jquery-3.2.1.min.js"></script>
	<script src="resources/ClientTemplate/js/popper.min.js"></script>
	<script src="resources/ClientTemplate/js/bootstrap.min.js"></script>
	<!-- ALL PLUGINS -->
	<script src="resources/ClientTemplate/js/jquery.superslides.min.js"></script>
	<script src="resources/ClientTemplate/js/images-loded.min.js"></script>
	<script src="resources/ClientTemplate/js/isotope.min.js"></script>
	<script src="resources/ClientTemplate/js/baguetteBox.min.js"></script>
	<script src="resources/ClientTemplate/js/form-validator.min.js"></script>
	<script src="resources/ClientTemplate/js/contact-form-script.js"></script>
	<script src="resources/ClientTemplate/js/custom.js"></script>





</body>
</html>