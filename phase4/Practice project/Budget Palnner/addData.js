class Deal{
    constructor(dealId, client_name, project_name, project_manager, project_cost){
        this.dealId = dealId;
        this.client_name = client_name;
        this.project_name = project_name;
        this.project_manager = project_manager;
        this.project_cost = project_cost;
    }
}
var currentDealId =0;
var myData = null;

function initialize(){
    if (localStorage.getItem("myData") ===null){
       

        currentDealId = myData.length;
        localStorage.setItem("myData", JSON.stringify(myData));
    }else{
        myData = JSON.parse(localStorage.getItem("myData"));
        currentDealId = myData.length;
    }
}

function CreateTableFromJSON() {    
    initialize();
    $('tbody').empty()

    var myDataTest = JSON.parse(localStorage.getItem("myData"))

    //var myDataTest = JSON.parse(localStorage.getItem("myData"))

    $.each(myDataTest, function (key, value) {
        $('tbody').append(`<tr>
    <td>${value.dealId}</td>
    <td>${value.client_name}</td>
    <td>${value.project_name}</td>
    <td>${value.project_manager}</td>
    <td>${value.project_cost}</td>
    <td><button onclick="DeleteRow(${value.dealId})"> <img src="trashcan.png" width="50""> </button></td>
  </tr>`);
    })
}


function Add() {
    var clientName = document.getElementById("clientNameInput").value;
    var projectName = document.getElementById("projectNameInput").value;
    var projectManager = document.getElementById("projectManagerInput").value;
    var projectCost = document.getElementById("projectCostInput").value;


    document.getElementById("clientNameInput").value = "";
    document.getElementById("projectNameInput").value = "";
    document.getElementById("projectManagerInput").value = "";
    document.getElementById("projectCostInput").value = "";


    InsertRow(currentDealId, clientName, projectName, projectManager, projectCost);
   

}

function InsertRow(dealId, clientName, projectName, projectManager, projectCost) {
    var a= new Deal(dealId, clientName, projectName, projectManager, projectCost);
    myData.push(a);
    currentDealId++;
    localStorage.clear();
    localStorage.setItem("myData", JSON.stringify(myData))
   
    CreateTableFromJSON();

}

function DeleteRow(dealId) {
     
    for( var i = 0; i < myData.length; i++){ 
    
        if (parseInt(myData[i].dealId) === parseInt(dealId)) { 
            if(confirm("Confirm deletion" + JSON.stringify(myData[i]))){
                myData.splice(i,1);
                localStorage.removeItem("myData");
                localStorage.setItem("myData", JSON.stringify(myData))
            }else{
                break;
            }
    
         
        }
    
    }
    CreateTableFromJSON();
}

