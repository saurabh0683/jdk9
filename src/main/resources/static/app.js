function getDate() {
    $.ajax({
        url: "time", success: function (result) {
            $("#div1").html(result);
        }
    });
}