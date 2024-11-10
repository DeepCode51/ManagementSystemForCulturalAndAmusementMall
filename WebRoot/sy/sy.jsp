<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="images/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="images/css/style.css" rel='stylesheet' type='text/css' />
<script src="images/js/skycons.js"></script>
</head>
<body>
<div id="wrapper">
<br><br>
		<div class="content-bottom">
			<div class="col-md-6" style="margin:auto">
				<div class="weather">
					<div class="weather-top">
						<div class="weather-top-left">
							<div class="degree">
							<figure class="icons">
								<canvas id="partly-cloudy-day" width="64" height="64"></canvas>
							</figure>
							<span>37°</span>
							<div class="clearfix"></div>
							</div>
				<script>
							 var icons = new Skycons({"color": "#1ABC9C"}),
								  list  = [
									"clear-night", "partly-cloudy-day",
									"partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
									"fog"
								  ],
								  i;
							  for(i = list.length; i--; )
								icons.set(list[i], list[i]);

							  icons.play();
						</script>
							<p>星期五
								<label>13</label>
								<sup>th</sup>
								<script>document.write(new Date().getMonth());</script>月</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="weather-bottom">
			<div class="weather-bottom1">
				<div class="weather-head">
				<h4>多云</h4>
				<figure class="icons">
					<canvas id="cloudy" width="58" height="58"></canvas>
				</figure>					
					<script>
							 var icons = new Skycons({"color": "#999"}),
								  list  = [
									"clear-night", "cloudy",
									"partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
									"fog"
								  ],
								  i;

							  for(i = list.length; i--; )
								icons.set(list[i], list[i]);
							  icons.play();
						</script>
				<h6>20°</h6>
				<div class="bottom-head">
					<p>八月 16</p>
					<p>星期一</p>
				</div>
			</div>
			</div>
			<div class="weather-bottom1 ">
				<div class="weather-head">
			<h4>晴天</h4>
			<figure class="icons">
				<canvas id="clear-day" width="58" height="58"></canvas>				
			</figure>					
					<script>
							 var icons = new Skycons({"color": "#999"}),
								  list  = [
									"clear-night", "clear-day",
									"partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
									"fog"
								  ],
								  i;
							  for(i = list.length; i--; )
								icons.set(list[i], list[i]);

							  icons.play();
						</script>
			<h6>37°</h6>
			<div class="bottom-head">
					<p>八月 17</p>
					<p>星期二</p>
				</div>
			</div>
			</div>
			<div class="weather-bottom1">
				<div class="weather-head">
				<h4>下雨</h4>
				<figure class="icons">
					<canvas id="sleet" width="58" height="58"></canvas>
				</figure>
				<script>
							 var icons = new Skycons({"color": "#999"}),
								  list  = [
									"clear-night", "clear-day",
									"partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
									"fog"
								  ],
								  i;
							  for(i = list.length; i--; )
								icons.set(list[i], list[i]);
							  icons.play();
						</script>
				<h6>7°</h6>
				<div class="bottom-head">
					<p>八月 18</p>
					<p>星期三</p>
				</div>
			</div>
			</div>
			<div class="weather-bottom1 ">
				<div class="weather-head">
			<h4>下雪</h4>
			<figure class="icons">
					<canvas id="snow" width="58" height="58"></canvas>
				</figure>
				<script>
							 var icons = new Skycons({"color": "#999"}),
								  list  = [
									"clear-night", "clear-day",
									"partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
									"fog"
								  ],
								  i;
							  for(i = list.length; i--; )
								icons.set(list[i], list[i]);
							  icons.play();
						</script>
			<h6>-10°</h6>
			<div class="bottom-head">
					<p>八月 16</p>
					<p>星期四</p>
				</div>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
				</div>
			</div>
		</div>
<div class="copy">
            <p> &copy; <script>document.write(new Date().getFullYear());</script> Minimal. All Rights Reserved | Design by  </p>
	    </div>
		</div>
       </div>
     </div>
</body>
</html>