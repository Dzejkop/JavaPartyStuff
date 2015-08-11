$(function() {
  $(".panel").hover(
    function() {
      $(this).css("background-color", "#ff9595");
    },
    function() {
      $(this).removeAttr('style');
    }
  )
});
