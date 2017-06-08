var app = angular.module('app',[]);

app.directive("headerPage", function(){
    return{
        restrict:'E',
        templateUrl:'static/attachments/header.html'
    };
});

app.directive("bodyPage", function(){
    return{
        restrict: 'E',
        templateUrl:'static/attachments/body.html',
        controller: function(){
            this.characters = [{
            firstName:"Netero", lastName:"Isaac", email:"issac.netero@gmail.com",age:"125",occupation:"Hunter",birthDate:"1889-01-01"
    }];
                this.submitForm = function(){
        this.characters.push({firstName:this.Object.firstName, lastName:this.Object.lastName,email:this.Object.email,age:this.Object.age,occupation:this.Object.occupation,birthDate:this.Object.birthDate});

        this.Object.firstName="";
        this.Object.lastName="";
        this.Object.email="";
        this.Object.age="";
        this.Object.occupation="";
        this.Object.birthDate="";
    }
    },
        controllerAs:'cont'
}});

