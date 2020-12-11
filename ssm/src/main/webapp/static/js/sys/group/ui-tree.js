var UITree = function () {

    return {
        //main function to initiate the module
        init: function () {
            // handle collapse/expand for tree_1
            /*$('#tree_1_collapse').click(function () {
                $('.tree-toggle', $('#tree_1 > li > ul')).addClass("closed");
                $('.branch', $('#tree_1 > li > ul')).removeClass("in");
            });

            $('#tree_1_expand').click(function () {
                $('.tree-toggle', $('#tree_1 > li > ul')).removeClass("closed");
                $('.branch', $('#tree_1 > li > ul')).addClass("in");
            });*/

            // handle collapse/expand for tree_2
            /*$('#tree_2_collapse').click(function () {
                $('.tree-toggle', $('#tree_2 > li > ul')).addClass("closed");
                $('.branch', $('#tree_2 > li > ul')).removeClass("in");
            });

            $('#tree_2_expand').click(function () {
                //$('.tree-toggle', $('#tree_2 > li > ul')).removeClass("closed");
                // iterate tree nodes and exppand all nodes
                $('.tree-toggle', $('#tree_2 > li > ul')).each(function () {
                    $(this).click(); //trigger tree node click
                });
                $('.branch', $('#tree_2 > li > ul')).addClass("in");
            });*/

            //This is a quick example of capturing the select event on tree leaves, not branches
            //选中叶子节点
            $("#tree_1").on("nodeselect.tree.data-api", "[data-role=leaf]", function (e) {
                var output = "";
                alert("选中叶子节点");
               /* output += "Node nodeselect event fired:\n";
                output += "Node Type: leaf\n";
                output += "Value: " + ((e.node.value) ? e.node.value : e.node.el.text()) + "\n";
                output += "Parentage: " + e.node.parentage.join("/");*/
                console.log(e);
                //alert(output);
            });

            //This is a quick example of capturing the select event on tree branches, not leaves
            //选中非叶子节点
            $("#tree_1").on("nodeselect.tree.data-api", "[role=branch]", function (e) {
                var output = "Node nodeselect event fired:\n"; + "Node Type: branch\n" + "Value: " + ((e.node.value) ? e.node.value : e.node.el.text()) + "\n" + "Parentage: " + e.node.parentage.join("/") + "\n"
                alert("选中非叶子节点");
                //alert(output);
            });

            //Listening for the 'openbranch' event. Look for e.node, which is the actual node the user opens
            //打开分支
            $("#tree_1").on("openbranch.tree", "[data-toggle=branch]", function (e) {
                var output = "Node openbranch event fired:\n" + "Node Type: branch\n" + "Value: " + ((e.node.value) ? e.node.value : e.node.el.text()) + "\n" + "Parentage: " + e.node.parentage.join("/") + "\n"
                alert("打开分支");
                //alert(output);
            });

            //Listening for the 'closebranch' event. Look for e.node, which is the actual node the user closed
            //关闭分支
            $("#tree_1").on("closebranch.tree", "[data-toggle=branch]", function (e) {
                var output = "Node closebranch event fired:\n" + "Node Type: branch\n" + "Value: " + ((e.node.value) ? e.node.value : e.node.el.text()) + "\n" + "Parentage: " + e.node.parentage.join("/") + "\n"
                alert("关闭分支");
                //alert(output);
            });
        }
    };
}();