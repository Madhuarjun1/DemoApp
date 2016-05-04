// app.js
var demoApp = angular.module('DemoApp', ['ui.router','ui.bootstrap','DemoApp.controllers','DemoApp.directives','DemoApp.services']);

demoApp.config(function($stateProvider, $urlRouterProvider,$locationProvider) {
    
    $urlRouterProvider.otherwise('/');
    $locationProvider.html5Mode(true);
    
    $stateProvider
         .state('home', {
            url: '/home',
            templateUrl: 'static/partials/AddOrUpdateUser.html',
            params: {
                data: null
            }
        }).state('vieworUpdateorDelete', {
            url: '/view',
            templateUrl: 'static/partials/VieworUpdateorDelete.html'
        });
});