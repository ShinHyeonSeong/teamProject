$(document).ready(function () {

    var $header = $('header');
    var $nav = $('nav');

    $(window).scroll(function () {
        if ($(this).scrollTop() > 0) {
            $header.addClass('scrolled');
        } 
        else {
            $header.removeClass('scrolled');
        }
    });

})
