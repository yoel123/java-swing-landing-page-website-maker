 ypreloader();
 $(document).ready(function(){
    $('.sidenav').sidenav();
     y_scroll_to(".ymenu li a")
  });
  
function y_scroll_to(selctor)
{
	   
	   
	   $(selctor).click(function() {
		scrollto_element = $(this).attr("href")
		console.log(scrollto_element)
        $('html, body').animate({
            scrollTop: $(scrollto_element).offset().top
        }, 500);
        return false;
    });
}

function ypreloader()
{
	$(window).on('load', function () {
	  var $preloader = $('.ypreload');
	  setTimeout(function(){
		  $preloader.fadeOut(1200);
	  }, 900);
	
	});
}//ypreloader