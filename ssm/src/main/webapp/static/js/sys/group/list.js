/**
 * 组织机构树
 */
var GroupRelationTree = function () {
	var json = '[' +
	'{' +
	'"text": "Parent 1",' +
	'"nodes": [' +
	'{' +
	'"text": "Child 1",' +
	'"nodes": [' +
	'{' +
	'"text": "Grandchild 1"' +
	'},' +
	'{' +
	'"text": "Grandchild 2"' +
	'}' +
	']' +
	'},' +
	'{' +
	'"text": "Child 2"' +
	'}' +
	']' +
	'},' +
	'{' +
	'"text": "Parent 2"' +
	'},' +
	'{' +
	'"text": "Parent 3"' +
	'},' +
	'{' +
	'"text": "Parent 4"' +
	'},' +
	'{' +
	'"text": "Parent 5"' +
	'}' +
	']';

	return {
		init: function () {
			alert(111);
			if (!jQuery().Tree) {
				alert(222);
				return;
			}
			
			console.log($('#tree_2'));
			
			alert(333);
			$('#tree_2').fn.tree({
				levels: 1,
				data: {"text": "Parent 1",}
			});
		}
	};
}();