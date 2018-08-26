
/**
 * 菜单树的处理
 * 
 */
var Menu = function () {

	var handleSiderMenu = function () {
		var openMenuId = menu;
		var openMenuObj;
		var firstLIObj ;
		var selectedSpan = "<span class='selected'></span>";
		if(""==openMenuId){
			firstLIObj = jQuery(".start");
			firstLIObj.addClass("active");
			jQuery(firstLIObj.children()[0]).append(selectedSpan);
		}else{
			openMenuObj = document.getElementById(openMenuId);
			jQuery(openMenuObj).parent().addClass("active");

			firstLIObj = jQuery(openMenuObj).parent().parent().parent();
			console.log(firstLIObj);
			firstLIObj.addClass("active");
			firstLIObj.children("a").children('.arrow').append(selectedSpan);
			firstLIObj.children("a").children('.arrow').addClass("open");
			firstLIObj.append(selectedSpan);
		}
	}
	return {
		init: function () {
			handleSiderMenu();
		}
	};
}();