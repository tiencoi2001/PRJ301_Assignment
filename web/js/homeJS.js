/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$j(window).bind("load", function () {
    var width = $j(window).width();
    if (width >= 979) {
        reinitCycle2(4);
    } else if (width >= 770) {
        reinitCycle2(3);
    } else if (width >= 479) {
        reinitCycle2(2);
    } else {
        reinitCycle2(1);
    }
});

$j(window).on('resize', function () {
    var width = $j(window).width();
    if (width >= 979) {
        reinitCycle2(4);
    } else if (width >= 770) {
        reinitCycle2(3);
    } else if (width >= 479) {
        reinitCycle2(2);
    } else {
        reinitCycle2(1);
    }
});

function reinitCycle2(visibleSlides) {
    try {
        $j('.newsoffers').cycle('destroy');
        $j('.newsoffers').cycle({
            "carouselSlideDimension": "240px",
            "carouselVisible": visibleSlides,
            "fx": "carousel",
            "timeout": 0,
            "next": ".newsoffers_next",
            "prev": ".newsoffers_prev",
            "slideActiveClass": "active",
            "slides": "li",
            "allowWrap": false,
        });
        $j('.membercgv').cycle('destroy');
        $j('.membercgv').cycle({
            "carouselSlideDimension": "240px",
            "carouselVisible": visibleSlides,
            "fx": "carousel",
            "timeout": 0,
            "next": ".membercgv_next",
            "prev": ".membercgv_prev",
            "slideActiveClass": "active",
            "slides": "li",
            "allowWrap": false,
        });
    } catch (err) {
        console.log(err.message);
    }
}

