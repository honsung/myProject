var Login = function () {
    
    return {
        //启动模块的主要功能
        init: function () {
        	
           $('.login-form').validate({
	            errorElement: 'label', //默认输入错误消息容器
	            errorClass: 'help-inline', // 默认输入错误样式
	            focusInvalid: false, // 是否焦点到最后一个无效输入框
	            rules: {
	                username: {
	                    required: true
	                },
	                password: {
	                    required: true
	                },
	                remember: {
	                    required: false
	                }
	            },

	            messages: {
	                username: {
	                    required: "用户名是必填项."
	                },
	                password: {
	                    required: "密码是必填项."
	                }
	            },

	            invalidHandler: function (event, validator) { //在表单提交时显示错误警报   
	                $('.alert-error', $('.login-form')).show();
	            },

	            highlight: function (element) { // 标出错误输入
	                $(element)
	                    .closest('.control-group').addClass('error'); // 在控件组上设置错误的样式
	            },

	            success: function (label) {
	                label.closest('.control-group').removeClass('error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                error.addClass('help-small no-left-padding').insertAfter(element.closest('.input-icon'));
	            },

	            submitHandler: function (form) {
	            	console.log(form);
	            	window.form.submit();
	                //window.location.href = "index.html";
	            }
	        });

	        $('.login-form input').keypress(function (e) {
	            if (e.which == 13) {
	                if ($('.login-form').validate().form()) {
	                    //window.location.href = "index.html";
	                    /*form.action = baseDir+"\tologin";
		            	form.submit();*/
	                }
	                return false;
	            }
	        });

	        $('.forget-form').validate({
	            errorElement: 'label', //默认输入错误消息容器
	            errorClass: 'help-inline', // 默认输入错误样式
	            focusInvalid: false, // 是否焦点到最后一个无效输入框
	            ignore: "",
	            rules: {
	                email: {
	                    required: true,
	                    email: true
	                }
	            },

	            messages: {
	                email: {
	                    required: "邮箱是必填项."
	                }
	            },

	            invalidHandler: function (event, validator) { //在表单提交时显示错误警报   

	            },

	            highlight: function (element) { // 标出错误输入
	                $(element)
	                    .closest('.control-group').addClass('error'); // 在控件组上设置错误的样式
	            },

	            success: function (label) {
	                label.closest('.control-group').removeClass('error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                error.addClass('help-small no-left-padding').insertAfter(element.closest('.input-icon'));
	            },

	            submitHandler: function (form) {
	                window.location.href = "index.html";
	            }
	        });

	        $('.forget-form input').keypress(function (e) {
	            if (e.which == 13) {
	                if ($('.forget-form').validate().form()) {
	                    window.location.href = "index.html";
	                }
	                return false;
	            }
	        });

	        jQuery('#forget-password').click(function () {
	            jQuery('.login-form').hide();
	            jQuery('.forget-form').show();
	        });

	        jQuery('#back-btn').click(function () {
	            jQuery('.login-form').show();
	            jQuery('.forget-form').hide();
	        });

	        $('.register-form').validate({
	            errorElement: 'label', 
	            errorClass: 'help-inline', 
	            focusInvalid: false, 
	            ignore: "",
	            rules: {
	                username: {
	                    required: true
	                },
	                password: {
	                    required: true
	                },
	                rpassword: {
	                    equalTo: "#register_password"
	                },
	                email: {
	                    required: true,
	                    email: true
	                },
	                tnc: {
	                    required: true
	                }
	            },

	            messages: { // 对于单选按钮和复选框的自定义消息
	                tnc: {
	                    required: "Please accept TNC first."
	                }
	            },

	            invalidHandler: function (event, validator) { //在表单提交时显示错误警报 

	            },

	            highlight: function (element) { // 标出错误输入框
	                $(element)
	                    .closest('.control-group').addClass('error'); // 在控件组上设置错误的样式
	            },

	            success: function (label) {
	                label.closest('.control-group').removeClass('error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                if (element.attr("name") == "tnc") { // 在容器之后插入复选框错误          
	                    error.addClass('help-small no-left-padding').insertAfter($('#register_tnc_error'));
	                } else {
	                    error.addClass('help-small no-left-padding').insertAfter(element.closest('.input-icon'));
	                }
	            },

	            submitHandler: function (form) {
	                window.location.href = "index.html";
	            }
	        });

	        jQuery('#register-btn').click(function () {
	            jQuery('.login-form').hide();
	            jQuery('.register-form').show();
	        });

	        jQuery('#register-back-btn').click(function () {
	            jQuery('.login-form').show();
	            jQuery('.register-form').hide();
	        });
        }

    };

}();