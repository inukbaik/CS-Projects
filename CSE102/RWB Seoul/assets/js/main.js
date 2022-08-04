/*
	Spectral by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
*/

(function($) {

 
var time; // 슬라이드 넘어가는 시간
var $carouselLi;
var carouselCount; // 캐러셀 사진 갯수
var currentIndex; // 현재 보여지는 슬라이드 인덱스 값
var caInterval;

//사진 연결
var imgW; // 사진 한장의 너비	
$(document).ready(function(){

	carouselInit(500, 3000);
});

$(window).resize(function(){
	carousel_setImgPosition();
});

/* 초기 설정 */
function carouselInit( height, t ){
	/*
	 * height : 캐러셀 높이
	 * t : 사진 전환 간격 
	*/

	time = t;
	$("#carousel_section").height(height); // 캐너셀 높이 설정
	$carouselLi = $("#carousel_section > ul >li");
	carouselCount = $carouselLi.length; // 캐러셀 사진 갯수
	currentIndex = 0; // 현재 보여지는 슬라이드 인덱스 값
	carousel_setImgPosition();
	carousel();
}

function carousel_setImgPosition(){

	imgW = $carouselLi.width(); // 사진 한장의 너비	
	// 이미지 위치 조정
	for(var i = 0; i < carouselCount; i++)
	{
		if( i == currentIndex)
		{
			$carouselLi.eq(i).css("left", 0);
		}
		else
		{
			$carouselLi.eq(i).css("left", imgW);
		}
	}
}

function carousel(){

	// 사진 넘기기
	// 사진 하나가 넘어간 후 다시 꼬리에 붙어야함
	// 화면에 보이는 슬라이드만 보이기
	caInterval = setInterval(function(){
		var left = "-" + imgW;

		//현재 슬라이드를 왼쪽으로 이동 ( 마이너스 지점 )
		$carouselLi.eq(currentIndex).animate( { left: left }, function(){
			// 다시 오른쪽 (제자리)로 이동
			$carouselLi.eq(currentIndex).css("left", imgW);

			if( currentIndex == ( carouselCount - 1 ) )
			{
				currentIndex = 0;
			}
			else
			{
				currentIndex ++;
			}
		} );

		// 다음 슬라이드 화면으로
		if( currentIndex == ( carouselCount - 1 ) )
		{
			// 마지막 슬라이드가 넘어갈땐 처음 슬라이드가 보이도록
			$carouselLi.eq(0).animate( { left: 0 } );
		}
		else
		{
			$carouselLi.eq(currentIndex + 1).animate( { left: 0 } );
		}
	}, time);
}

    
    
	var	$window = $(window),
		$body = $('body'),
		$wrapper = $('#page-wrapper'),
		$banner = $('#banner'),
		$header = $('#header');

	// Breakpoints.
		breakpoints({
			xlarge:   [ '1281px',  '1680px' ],
			large:    [ '981px',   '1280px' ],
			medium:   [ '737px',   '980px'  ],
			small:    [ '481px',   '736px'  ],
			xsmall:   [ null,      '480px'  ]
		});

	// Play initial animations on page load.
		$window.on('load', function() {
			window.setTimeout(function() {
				$body.removeClass('is-preload');
			}, 100);
		});

	// Mobile?
		if (browser.mobile)
			$body.addClass('is-mobile');
		else {

			breakpoints.on('>medium', function() {
				$body.removeClass('is-mobile');
			});

			breakpoints.on('<=medium', function() {
				$body.addClass('is-mobile');
			});

		}

	// Scrolly.
		$('.scrolly')
			.scrolly({
				speed: 1500,
				offset: $header.outerHeight()
			});

	// Menu.
		$('#menu')
			.append('<a href="#menu" class="close"></a>')
			.appendTo($body)
			.panel({
				delay: 500,
				hideOnClick: true,
				hideOnSwipe: true,
				resetScroll: true,
				resetForms: true,
				side: 'right',
				target: $body,
				visibleClass: 'is-menu-visible'
			});

	// Header.
		if ($banner.length > 0
		&&	$header.hasClass('alt')) {

			$window.on('resize', function() { $window.trigger('scroll'); });

			$banner.scrollex({
				bottom:		$header.outerHeight() + 1,
				terminate:	function() { $header.removeClass('alt'); },
				enter:		function() { $header.addClass('alt'); },
				leave:		function() { $header.removeClass('alt'); }
			});

		}

})(jQuery);