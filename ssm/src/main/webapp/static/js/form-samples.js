var FormSamples = function () {
    return {
        //启动模块的主要功能
        init: function () {

            // 使用select2下拉而不是作为select2工作正常反应布局引导。
            $('.select2_category').select2({
	            placeholder: "选择一个选项",
	            allowClear: true
	        });

            $('.select2_sample1').select2({
                placeholder: "选择一个国家",
                allowClear: true
            });

            $(".select2_sample2").select2({
                placeholder: "请选择",
                allowClear: true,
                minimumInputLength: 1,
                query: function (query) {
                    var data = {
                        results: []
                    }, i, j, s;
                    for (i = 1; i < 5; i++) {
                        s = "";
                        for (j = 0; j < i; j++) {
                            s = s + query.term;
                        }
                        data.results.push({
                            id: query.term + i,
                            text: s
                        });
                    }
                    query.callback(data);
                }
            });

            $(".select2_sample3").select2({
                tags: ["red", "green", "blue", "yellow", "pink"]
            });

        }

    };

}();