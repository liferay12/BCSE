;(function ($) {
 
    $.fn.runCounter = function (options) {
        var defaults = {
            start: 30,
            end: 0,
            duration: 30000
        };
 
        var opt = $.extend(defaults, options);
 
        return this.each(function () {
            var $para = $(this);
            $({ ctr: opt.start }).animate({ ctr: opt.end }, {
                duration: opt.duration,
                easing: 'linear',
                step: function () {
                    $para.text(Math.round(this.ctr));
                }
            });
        });
    }
 
})(jQuery);