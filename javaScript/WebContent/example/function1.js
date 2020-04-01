//변수 값이 null, 0 >> 거짓(false)
//변수 값이 있건, "값" >> 참(true)

var num = 1;

function gallery(direct) {
    if (direct) {//증가
        if (num == 4)
            return;
        num++;
    } else {//감소
        if (num == 1)
            return;
        num--;
    }
    var photo = document.getElementById("photo");
    photo.setAttribute("src", "./images/images" + num + ".jpg")
}
