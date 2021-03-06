<!DOCTYPE html>
<html lang="en">
  <head>
  	<base href="/DemoApp/">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    

    <title>Demo Application</title>

    <!-- Bootstrap CSS -->    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="static/css/bootstrap-theme.css" rel="stylesheet">
    <link href="static/css/bootstrap-custom.css" rel="stylesheet">
	<link href="static/css/font-awesome.min.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="static/css/elegant-icons-style.css" rel="stylesheet" />
      
  
  

    <link href="static/css/style.css" rel="stylesheet">
    <link href="static/css/style-responsive.css" rel="stylesheet" />
	<link href="static/css/custom.css" rel="stylesheet" />
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
  </head>

  <body ng-app="DemoApp">
  <!-- container section start -->
  <section id="container" class="">
     
      
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
            </div>

            
            <a class="logo" href="#"> <span class="lite">Demo Application</span></a>

           

            <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">
                    
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <!-- <img alt="" src="img/India.png"> -->
                            </span>
                            <span class="username">Madhu Arjun</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="#"><i class="icon_profile"></i> My Profile</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_mail_alt"></i> My Inbox</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_clock_alt"></i> Timeline</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_chat_alt"></i> Chats</a>
                            </li>
                            <li>
                                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>Module1</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" ui-sref="home">Add/Update User</a></li>                          
                          <li><a class="" ui-sref="vieworUpdateorDelete">View All Users</a></li>
                       </ul>
                  </li>       
                  
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>Module2</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="form_component.html">Add User</a></li>                          
                          <li><a class="" href="form_validation.html">Update User</a></li>
                          <li><a class="" href="form_validation.html">Delete User</a></li>
                      </ul>
                  </li> 
                  
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>Module3</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="form_component.html">Add User</a></li>                          
                          <li><a class="" href="form_validation.html">Update User</a></li>
                          <li><a class="" href="form_validation.html">Delete User</a></li>
                      </ul>
                  </li>
                             
                 <li>
                      <a class="" href="">
                         <!--  <i class="icon_house_alt"></i> -->
                          <span>Logout</span>
                      </a>
                  </li>
                  
                 
                  
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!--main content start-->
      <section id="main-content">
         <div ui-view></div>
      </section>
      <!--main content end-->
  </section>
  <!-- container section start -->

    <!-- javascripts -->
    <script src="static/js/jquery.js"></script>
	<script src="static/js/jquery-ui-1.10.4.min.js"></script>
    <script src="static/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="static/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="static/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="static/js/jquery.scrollTo.min.js"></script>
    <script src="static/js/jquery.nicescroll.js" type="text/javascript"></script>
    
   
    <!--custome script for all page-->
    <script src="static/js/scripts.js"></script>
    
  	<script src="static/angular/angular.js"></script>
    <script src="static/angular/angular-ui-router.js"></script>
    <script src="static/angular/ui-bootstrap-tpls-0.13.3.js"></script>
	
	<script src="static/angular/angular-css.js"></script>
    <script src="static/customlib/app.js"></script>
    <script src="static/customlib/controllers.js"></script>
	<script src="static/customlib/directives.js"></script>
	<script src="static/customlib/services.js"></script>
  </body>
</html>
