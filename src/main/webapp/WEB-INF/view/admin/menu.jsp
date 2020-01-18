<div class="main-menu">
	<header class="header">
		<a href="index.html" class="logo">NinjaTeam</a>
		<button type="button" class="button-close fa fa-times js__menu_close"></button>
		<div class="user">
			<a href="#" class="avatar"><img
				src="adminResources/image/avatar.png" alt=""><span
				class="status online"></span></a>
			<h5 class="name">
				<a href="profile.html">Emily Stanley</a>
			</h5>
			<h5 class="position">Administrator</h5>
			<!-- /.name -->
			<div class="control-wrap js__drop_down">
				<i class="fa fa-caret-down js__drop_down_button"></i>
				<div class="control-list">
					<div class="control-item">
						<a href="profile.html"><i class="fa fa-user"></i> Profile</a>
					</div>
					<div class="control-item">
						<a href="#"><i class="fas fa-cog"></i> Settings</a>
					</div>
					<div class="control-item">
						<a href="#"><i class="fa fa-sign-out"></i> Log out</a>
					</div>
				</div>
				<!-- /.control-list -->
			</div>
			<!-- /.control-wrap -->
		</div>
		<!-- /.user -->
	</header>
	<!-- /.header -->
	<div class="content">

		<div class="navigation">

			<!-- /.title -->
			<ul class="menu js__accordion">
				<li><a class="waves-effect" href="index.html"><i
						class="menu-icon fa fa-home"></i><span>Dashboard</span></a></li>
			</ul>
			<!-- /.menu js__accordion -->
			<!-- /.title -->
			<ul class="menu js__accordion">

		<!--------------------------------------------------------- MANAGE STATE ----------------------------------------------------->

				<li><a class="waves-effect parent-item js__control" href="#">
						<i class="menu-icon far fa-chart-bar"></i> <span>Manage
							State</span> <span class="menu-arrow fa fa-angle-down"></span>
				</a>

					<ul class="sub-menu js__content">
						<li><a href="loadstate">Add State</a></li>
						<li><a href="viewState">View State</a></li>
					</ul> <!-- /.sub-menu js__content --></li>

		<!--------------------------------------------------------- MANAGE CITY ----------------------------------------------------->

					<li><a class="waves-effect parent-item js__control" href="#">
						<i class="menu-icon far fa-chart-bar"></i> <span>Manage
							City</span> <span class="menu-arrow fa fa-angle-down"></span>
				</a>

					<ul class="sub-menu js__content">
						<li><a href="loadcity">Add City</a></li>
						<li><a href="viewCity">View city</a></li>
					</ul> <!-- /.sub-menu js__content --></li>


			</ul>

		</div>
		<!-- /.navigation -->
	</div>
	<!-- /.content -->
</div>