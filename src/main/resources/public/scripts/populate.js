function CreateTableFromJSON(products) {
    var col = [];
    for (var i = 0; i < products.length; i++) {
        for (var key in products[i]) {
            if (col.indexOf(key) === -1) {
                col.push(key);
            }
        }
    }

    var table = document.createElement("table");

    var tr = table.insertRow(-1);

    for (var i = 0; i < col.length; i++) {
        var th = document.createElement("th");
        th.innerHTML = col[i];
        tr.appendChild(th);
    }

    for (var i = 0; i < products.length; i++) {

        tr = table.insertRow(-1);

        for (var j = 0; j < col.length; j++) {
            var tabCell = tr.insertCell(-1);
            tabCell.innerHTML = products[i][col[j]];
        }
    }

    var divContainer = document.getElementById("productDiv");
    divContainer.innerHTML = "";
    divContainer.appendChild(table);
}

var products;
function ajax() {
    $.ajax({
        url: "data",
        dataType: "json"
    }).done(CreateTableFromJSON);
};

$(document).ready(ajax());