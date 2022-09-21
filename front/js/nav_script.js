$(document).ready(function () {

    var $header = $('header');

    $(window).scroll(function () {
        if ($(this).scrollTop() > 0) {
            $header.addClass('scrolled');
        } 
        else {
            $header.removeClass('scrolled');
        }
    });

})
