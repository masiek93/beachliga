<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="Thomas Bartnik">
    <!-- <link rel="icon" href="../../favicon.ico">  -->

    <title>BeachLiga - Beach Volleyball </title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <link href="css/navbar-fixed-top.css" rel="stylesheet">
    <!-- <link href="css/sticky-footer.css" rel="stylesheet"> -->
    <link href="css/Footer-with-button-logo.css" rel="stylesheet">
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!-- font awesome -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>

  <body>
 	<%@ include file="header.jsp" %>
  	
<%-- 	<div id="header"></div> --%>
    <div class="container">
    
      <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-example-generic" data-slide-to="1"></li>
          <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img src="images/baner1.jpg" alt="First slide">
            <div class="carousel-caption">
        		<h1>Block</h1>
        		<p>Build a wall over the net!</p>
      		</div>
          </div>
          <div class="item">
            <img src="images/baner2.jpg" alt="Second slide">
            <div class="carousel-caption">
        		<h1>Defense</h1>
        		<p>Keep all the balls above the sand!</p>
      		</div>
          </div>
          <div class="item">
            <img src="images/baner3.jpg" alt="Third slide">
            <div class="carousel-caption">
        		<h1>Service</h1>
        		<p>Just focus and score!</p>
      		</div>
          </div>
        </div>
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>

     <!--  Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h2>Hi Man! Wanna play?</h2>
        <p>Do you also love beach volleyball, more than 30 degrees and this feeling of the burning sand under your feet?<br />
        Join our tournaments and try to be the first in the Ranking!<br />
        Good luck!</p>
      </div>

    </div> <!-- /container -->
  	<%@ include file="footer.jsp" %>
	
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
