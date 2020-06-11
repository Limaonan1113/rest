
let app = new Vue({
    el:'#app',
    data:{
        message: 'Hello Vue!'
    }
});

let app2 = new Vue({
    el:'#app2',
    data:{
        message: '页面加载于'+new Date().toLocaleString()
    }

});

let app4 = new Vue({
    el:'#app4',
    data:{
        todos:[
            {text:'12321'},
            {text:'12321'},
            {text: 'dsuhfds'}
        ]
    }
});