function CheckWeight(name, height, weight) {
    this.myName = name;
    this.myHeight = height;
    this.myWeight = weight;
    this.minWeight;
    this.maxWeight;
    // this.getInfo = function (){
    //     var str = "";
    //     str += "이름은 : " + this.myName + ", "
    //     str += "키는 : " + this.myHeight + ", "
    //     str += "몸무게 : " + this.myWeight
    //     return str;
    // }
    // this.getResult = function () {
    //     this.minWeight = (this.myHeight - 100) * 0.9 - 5;
    //     this.maxWeight = (this.myHeight - 100) * 0.9 + 5;
    //     if (this.myWeight < this.minWeight) {
    //         return "체중미달"
    //     } else if (this.myWeight < this.maxWeight) {
    //         return "과체중";
    //     } else {
    //         return "정상";
    //     }
    // }
}

CheckWeight.prototype.getInfo=function(){
    var str = "";
    str += "이름은 : " + this.myName + ", "
    str += "키는 : " + this.myHeight + ", "
    str += "몸무게 : " + this.myWeight
    return str;
}

CheckWeight.prototype.getResult = function(){
    this.minWeight = (this.myHeight - 100) * 0.9 - 5;
    this.maxWeight = (this.myHeight - 100) * 0.9 + 5;
    if (this.myWeight < this.minWeight) {
        return "체중미달"
    } else if (this.myWeight < this.maxWeight) {
        return "과체중";
    } else {
        return "정상";
    }
}

var person = new CheckWeight("hong", 179, 70);
console.log(person);
console.log(person.getInfo());
console.log(person.getResult());

// for (field in person) {
//     console.log(field, person[field]);
// }
console.log(person);