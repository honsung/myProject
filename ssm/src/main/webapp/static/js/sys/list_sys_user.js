var List_Sys_User = function () {

    return {

        //main function to initiate the module
        init: function () {
            
            if (!jQuery().dataTable) {
                return;
            }

            $('#list_sys_user').dataTable({
                "aLengthMenu": [
                    [5, 15, 20, -1],
                    [5, 15, 20, 50] // change per page values here
                ],
                // set the initial value
                "iDisplayLength": 5,
                "sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
                "sPaginationType": "bootstrap",
                "oLanguage": {
                    "sLengthMenu": "_MENU_ per page",
                    "oPaginate": {
                        "sPrevious": "上一页",
                        "sNext": "下一页"
                    }
                },
                "aoColumnDefs": [{
                        'bSortable': false,
                        'aTargets': [0]
                    }
                ]
            });

            jQuery('#list_sys_user .group-checkable').change(function () {
                var set = jQuery(this).attr("data-set");
                var checked = jQuery(this).is(":checked");
                jQuery(set).each(function () {
                    if (checked) {
                        $(this).attr("checked", true);
                    } else {
                        $(this).attr("checked", false);
                    }
                });
                jQuery.uniform.update(set);
            });
            jQuery('#list_sys_user_wrapper .dataTables_filter input').addClass("m-wrap small"); // modify table search input
            jQuery('#list_sys_user_wrapper .dataTables_length select').addClass("m-wrap small"); // modify table per page dropdown
            jQuery('#list_sys_user_wrapper .dataTables_length select').select2(); // initialzie select2 dropdown

           jQuery("#delete").click(function(){
        	   var checkedObjArray = new Array();
        	   jQuery(".checkboxes").each(function(){
        		   if(jQuery(this).attr("checked")){
        			   checkedObjArray.push(jQuery(this).val());
        		   }
        	   });
        	  console.log(checkedObjArray.join(","));
        	  if(0==checkedObjArray.length){
        		  alert("至少选择一行数据！");
        	  }else{
        		  
        	  }
           });
        }
    };
}();