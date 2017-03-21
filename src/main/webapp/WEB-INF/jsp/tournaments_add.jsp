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

<title>BeachLiga - Beach Volleyball</title>

<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="../css/ie10-viewport-bug-workaround.css" rel="stylesheet">

<link href="../css/navbar-fixed-top.css" rel="stylesheet">
<!-- <link href="css/sticky-footer.css" rel="stylesheet"> -->
<link href="../css/Footer-with-button-logo.css" rel="stylesheet">


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<%@ include file="header.jsp"%>

	<%-- 	<div id="header"></div> --%>
	<div class="container">

		<!--  Main component for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h2>Create new tournament</h2>
			<div class="form-group row">
				<label for=tournament-name class="col-2 col-form-label">Tournament
					name</label>
				<div class="col-10">
					<input class="form-control" type="text" id="tournament-name"
						placeholder="Name of your tournament">
				</div>
			</div>
			<div class="form-group row">
				<label for="tournament-address" class="col-2 col-form-label">Address</label>
				<div class="col-10">
					<input class="form-control" type="text" id="tournament-address"
						placeholder="Address of tournament">
				</div>
			</div>
			<div class="form-group row">
				<label for="tournament-city" class="col-2 col-form-label">City</label>
				<div class="col-10">
					<input class="form-control" type="text" id="tournament-city"
						placeholder="City of tournament">
				</div>
			</div>
			<h2>Choose date and time</h2>
			<div class="form-group row">
				<label for="example-date-input" class="col-2 col-form-label">Date</label>
				<div class="col-10">
					<input class="form-control" type="date" value="2011-08-19"
						id="example-date-input">
				</div>
			</div>
			<div class="form-group row">
				<label for="example-time-input" class="col-2 col-form-label">Time</label>
				<div class="col-10">
					<input class="form-control" type="time" value="13:45:00"
						id="example-time-input">
				</div>
			</div>
			<h2>Inscription fee per team</h2>
			<div class="form-group row">
				<label for="inscription-fee" class="col-2 col-form-label">Fee</label>
				<div class="col-10">
					<input class="form-control" type="text" id="inscription-fee"
						placeholder="fee amount in euro">
				</div>
			</div>
			<h2>Additional info</h2>
			<div class="form-group row">
				<textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
			</div>
			<br />
			<p><a class="btn btn-lg btn-success" href="#" role="button">Create!</a></p>
			<!-- 
			<form class="form-horizontal">
				<fieldset>
					Address form

					<h2>Address</h2>

					full-name input
					<div class="control-group">
						<label class="control-label">Full Name</label>
						<div class="controls">
							<input id="full-name" name="full-name" type="text"
								placeholder="full name" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					address-line1 input
					<div class="control-group">
						<label class="control-label">Address Line 1</label>
						<div class="controls">
							<input id="address-line1" name="address-line1" type="text"
								placeholder="address line 1" class="input-xlarge">
							<p class="help-block">Street address, P.O. box, company name,
								c/o</p>
						</div>
					</div>
					address-line2 input
					<div class="control-group">
						<label class="control-label">Address Line 2</label>
						<div class="controls">
							<input id="address-line2" name="address-line2" type="text"
								placeholder="address line 2" class="input-xlarge">
							<p class="help-block">Apartment, suite , unit, building,
								floor, etc.</p>
						</div>
					</div>
					city input
					<div class="control-group">
						<label class="control-label">City / Town</label>
						<div class="controls">
							<input id="city" name="city" type="text" placeholder="city"
								class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					region input
					<div class="control-group">
						<label class="control-label">State / Province / Region</label>
						<div class="controls">
							<input id="region" name="region" type="text"
								placeholder="state / province / region" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					postal-code input
					<div class="control-group">
						<label class="control-label">Zip / Postal Code</label>
						<div class="controls">
							<input id="postal-code" name="postal-code" type="text"
								placeholder="zip or postal code" class="input-xlarge">
							<p class="help-block"></p>
						</div>
					</div>
					country select
					<div class="control-group">
						<label class="control-label">Country</label>
						<div class="controls">
							<select id="country" name="country" class="input-xlarge">
								<option value="" selected="selected">(please select a
									country)</option>
								<option value="AF">Afghanistan</option>
								<option value="AL">Albania</option>
								<option value="DZ">Algeria</option>
								<option value="AS">American Samoa</option>
								<option value="AD">Andorra</option>
								<option value="AO">Angola</option>
								<option value="AI">Anguilla</option>
								<option value="AQ">Antarctica</option>
								<option value="AG">Antigua and Barbuda</option>
								<option value="AR">Argentina</option>
								<option value="AM">Armenia</option>
								<option value="AW">Aruba</option>
								<option value="AU">Australia</option>
								<option value="AT">Austria</option>
								<option value="AZ">Azerbaijan</option>
								<option value="BS">Bahamas</option>
								<option value="BH">Bahrain</option>
								<option value="BD">Bangladesh</option>
								<option value="BB">Barbados</option>
								<option value="BY">Belarus</option>
								<option value="BE">Belgium</option>
								<option value="BZ">Belize</option>
								<option value="BJ">Benin</option>
								<option value="BM">Bermuda</option>
								<option value="BT">Bhutan</option>
								<option value="BO">Bolivia</option>
								<option value="BA">Bosnia and Herzegowina</option>
								<option value="BW">Botswana</option>
								<option value="BV">Bouvet Island</option>
								<option value="BR">Brazil</option>
								<option value="IO">British Indian Ocean Territory</option>
								<option value="BN">Brunei Darussalam</option>
								<option value="BG">Bulgaria</option>
								<option value="BF">Burkina Faso</option>
								<option value="BI">Burundi</option>
								<option value="KH">Cambodia</option>
								<option value="CM">Cameroon</option>
								<option value="CA">Canada</option>
								<option value="CV">Cape Verde</option>
								<option value="KY">Cayman Islands</option>
								<option value="CF">Central African Republic</option>
								<option value="TD">Chad</option>
								<option value="CL">Chile</option>
								<option value="CN">China</option>
								<option value="CX">Christmas Island</option>
								<option value="CC">Cocos (Keeling) Islands</option>
								<option value="CO">Colombia</option>
								<option value="KM">Comoros</option>
								<option value="CG">Congo</option>
								<option value="CD">Congo, the Democratic Republic of
									the</option>
								<option value="CK">Cook Islands</option>
								<option value="CR">Costa Rica</option>
								<option value="CI">Cote d'Ivoire</option>
								<option value="HR">Croatia (Hrvatska)</option>
								<option value="CU">Cuba</option>
								<option value="CY">Cyprus</option>
								<option value="CZ">Czech Republic</option>
								<option value="DK">Denmark</option>
								<option value="DJ">Djibouti</option>
								<option value="DM">Dominica</option>
								<option value="DO">Dominican Republic</option>
								<option value="TP">East Timor</option>
								<option value="EC">Ecuador</option>
								<option value="EG">Egypt</option>
								<option value="SV">El Salvador</option>
								<option value="GQ">Equatorial Guinea</option>
								<option value="ER">Eritrea</option>
								<option value="EE">Estonia</option>
								<option value="ET">Ethiopia</option>
								<option value="FK">Falkland Islands (Malvinas)</option>
								<option value="FO">Faroe Islands</option>
								<option value="FJ">Fiji</option>
								<option value="FI">Finland</option>
								<option value="FR">France</option>
								<option value="FX">France, Metropolitan</option>
								<option value="GF">French Guiana</option>
								<option value="PF">French Polynesia</option>
								<option value="TF">French Southern Territories</option>
								<option value="GA">Gabon</option>
								<option value="GM">Gambia</option>
								<option value="GE">Georgia</option>
								<option value="DE">Germany</option>
								<option value="GH">Ghana</option>
								<option value="GI">Gibraltar</option>
								<option value="GR">Greece</option>
								<option value="GL">Greenland</option>
								<option value="GD">Grenada</option>
								<option value="GP">Guadeloupe</option>
								<option value="GU">Guam</option>
								<option value="GT">Guatemala</option>
								<option value="GN">Guinea</option>
								<option value="GW">Guinea-Bissau</option>
								<option value="GY">Guyana</option>
								<option value="HT">Haiti</option>
								<option value="HM">Heard and Mc Donald Islands</option>
								<option value="VA">Holy See (Vatican City State)</option>
								<option value="HN">Honduras</option>
								<option value="HK">Hong Kong</option>
								<option value="HU">Hungary</option>
								<option value="IS">Iceland</option>
								<option value="IN">India</option>
								<option value="ID">Indonesia</option>
								<option value="IR">Iran (Islamic Republic of)</option>
								<option value="IQ">Iraq</option>
								<option value="IE">Ireland</option>
								<option value="IL">Israel</option>
								<option value="IT">Italy</option>
								<option value="JM">Jamaica</option>
								<option value="JP">Japan</option>
								<option value="JO">Jordan</option>
								<option value="KZ">Kazakhstan</option>
								<option value="KE">Kenya</option>
								<option value="KI">Kiribati</option>
								<option value="KP">Korea, Democratic People's Republic
									of</option>
								<option value="KR">Korea, Republic of</option>
								<option value="KW">Kuwait</option>
								<option value="KG">Kyrgyzstan</option>
								<option value="LA">Lao People's Democratic Republic</option>
								<option value="LV">Latvia</option>
								<option value="LB">Lebanon</option>
								<option value="LS">Lesotho</option>
								<option value="LR">Liberia</option>
								<option value="LY">Libyan Arab Jamahiriya</option>
								<option value="LI">Liechtenstein</option>
								<option value="LT">Lithuania</option>
								<option value="LU">Luxembourg</option>
								<option value="MO">Macau</option>
								<option value="MK">Macedonia, The Former Yugoslav
									Republic of</option>
								<option value="MG">Madagascar</option>
								<option value="MW">Malawi</option>
								<option value="MY">Malaysia</option>
								<option value="MV">Maldives</option>
								<option value="ML">Mali</option>
								<option value="MT">Malta</option>
								<option value="MH">Marshall Islands</option>
								<option value="MQ">Martinique</option>
								<option value="MR">Mauritania</option>
								<option value="MU">Mauritius</option>
								<option value="YT">Mayotte</option>
								<option value="MX">Mexico</option>
								<option value="FM">Micronesia, Federated States of</option>
								<option value="MD">Moldova, Republic of</option>
								<option value="MC">Monaco</option>
								<option value="MN">Mongolia</option>
								<option value="MS">Montserrat</option>
								<option value="MA">Morocco</option>
								<option value="MZ">Mozambique</option>
								<option value="MM">Myanmar</option>
								<option value="NA">Namibia</option>
								<option value="NR">Nauru</option>
								<option value="NP">Nepal</option>
								<option value="NL">Netherlands</option>
								<option value="AN">Netherlands Antilles</option>
								<option value="NC">New Caledonia</option>
								<option value="NZ">New Zealand</option>
								<option value="NI">Nicaragua</option>
								<option value="NE">Niger</option>
								<option value="NG">Nigeria</option>
								<option value="NU">Niue</option>
								<option value="NF">Norfolk Island</option>
								<option value="MP">Northern Mariana Islands</option>
								<option value="NO">Norway</option>
								<option value="OM">Oman</option>
								<option value="PK">Pakistan</option>
								<option value="PW">Palau</option>
								<option value="PA">Panama</option>
								<option value="PG">Papua New Guinea</option>
								<option value="PY">Paraguay</option>
								<option value="PE">Peru</option>
								<option value="PH">Philippines</option>
								<option value="PN">Pitcairn</option>
								<option value="PL">Poland</option>
								<option value="PT">Portugal</option>
								<option value="PR">Puerto Rico</option>
								<option value="QA">Qatar</option>
								<option value="RE">Reunion</option>
								<option value="RO">Romania</option>
								<option value="RU">Russian Federation</option>
								<option value="RW">Rwanda</option>
								<option value="KN">Saint Kitts and Nevis</option>
								<option value="LC">Saint LUCIA</option>
								<option value="VC">Saint Vincent and the Grenadines</option>
								<option value="WS">Samoa</option>
								<option value="SM">San Marino</option>
								<option value="ST">Sao Tome and Principe</option>
								<option value="SA">Saudi Arabia</option>
								<option value="SN">Senegal</option>
								<option value="SC">Seychelles</option>
								<option value="SL">Sierra Leone</option>
								<option value="SG">Singapore</option>
								<option value="SK">Slovakia (Slovak Republic)</option>
								<option value="SI">Slovenia</option>
								<option value="SB">Solomon Islands</option>
								<option value="SO">Somalia</option>
								<option value="ZA">South Africa</option>
								<option value="GS">South Georgia and the South Sandwich
									Islands</option>
								<option value="ES">Spain</option>
								<option value="LK">Sri Lanka</option>
								<option value="SH">St. Helena</option>
								<option value="PM">St. Pierre and Miquelon</option>
								<option value="SD">Sudan</option>
								<option value="SR">Suriname</option>
								<option value="SJ">Svalbard and Jan Mayen Islands</option>
								<option value="SZ">Swaziland</option>
								<option value="SE">Sweden</option>
								<option value="CH">Switzerland</option>
								<option value="SY">Syrian Arab Republic</option>
								<option value="TW">Taiwan, Province of China</option>
								<option value="TJ">Tajikistan</option>
								<option value="TZ">Tanzania, United Republic of</option>
								<option value="TH">Thailand</option>
								<option value="TG">Togo</option>
								<option value="TK">Tokelau</option>
								<option value="TO">Tonga</option>
								<option value="TT">Trinidad and Tobago</option>
								<option value="TN">Tunisia</option>
								<option value="TR">Turkey</option>
								<option value="TM">Turkmenistan</option>
								<option value="TC">Turks and Caicos Islands</option>
								<option value="TV">Tuvalu</option>
								<option value="UG">Uganda</option>
								<option value="UA">Ukraine</option>
								<option value="AE">United Arab Emirates</option>
								<option value="GB">United Kingdom</option>
								<option value="US">United States</option>
								<option value="UM">United States Minor Outlying Islands</option>
								<option value="UY">Uruguay</option>
								<option value="UZ">Uzbekistan</option>
								<option value="VU">Vanuatu</option>
								<option value="VE">Venezuela</option>
								<option value="VN">Viet Nam</option>
								<option value="VG">Virgin Islands (British)</option>
								<option value="VI">Virgin Islands (U.S.)</option>
								<option value="WF">Wallis and Futuna Islands</option>
								<option value="EH">Western Sahara</option>
								<option value="YE">Yemen</option>
								<option value="YU">Yugoslavia</option>
								<option value="ZM">Zambia</option>
								<option value="ZW">Zimbabwe</option>
							</select>
						</div>
					</div>
				</fieldset>
			</form> -->
		</div>

	</div>
	<!-- /container -->
	<%@ include file="footer.jsp"%>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="../js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
