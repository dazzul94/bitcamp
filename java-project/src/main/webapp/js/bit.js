var bit = (selector) => {
    var el;
    if (typeof(selector) == 'function') {
        return selector();
    }
    if (selector instanceof HTMLElement) {
        el = [selector];
    } else if (selector.indexOf('<') != -1) {
        el = [document.createElement(selector.substr(1, selector.length -2))];
    } else {
        el = document.querySelectorAll(selector);
    }
    el.html = (value) => {
        for (var i = 0; i < el.length; i++) {
            el[i].innerHTML = value;
        }
        return el;
    };
    el.click = (cb) => {
        for (var i = 0; i < el.length; i++) {
            el[i].onclick = cb;
        }
        return el;
    };
    el.append = (childs) => {
        for (var i = 0; i < childs.length; i++) {
            el[el.length-1].appendChild(childs[i]);
        }
        return el;
    }
    el.appendTo = (parents) => {
        for (var i = 0; i < el.length; i++) {
            parents[parents.length -1].appendChild(el[i]);
        }
        return el;
    }
    el.addClass = (classname) => {
        for (var i = 0; i < el.length; i++) {
            var arr = el[i].className.split(" ");
            arr.push(classname);
            el[i].className = arr.join(' ');
        }
        return el;
    }
    el.removeClass = (classname) => {
        for (var i = 0; i < el.length; i++) {
            el[i].className = el[i].className.split(classname).join(' ');
        }
        return el;
    }
    el.css = (name, value) => {
        for (var i = 0; i < el.length; i++) {
            el[i].style[name] = value;
        }
        return el;
    }
    el.parent = () => { 
        return el[0].parentNode;
    };
    el.val = (value) => {
        if (value == undefined) {
            return el[0].value;
        } 
        for (var i = 0; i < el.length; i++) {
            el[i].value = value;
        }
        return el;
    };
    
    return el; 
};


bit.toQueryString = (obj) => {
    var qs = '';
    for (var propName in obj) {
        if (qs.length > 0) qs += '&';
        qs += propName + '=' + obj[propName]
    }
    return qs;
}

bit.ajax = (url, settings) => {

    if (settings == undefined) settings = {}; // settings가 안넘어오면 빈객체를 만든다
    if (settings.method == undefined) settings.method = 'GET'; // settins가
    // 넘어왔지만 method가
    // undefined라면
    // default 값을
    // GET으로 설정한다
    if (settings.data == undefined) settings.data = {}; // data가 안들어있으면 최소 빈
    // 객체(기본값) 설정
    if (settings.dataType == undefined) settings.dataType = 'text';

    var xhr = new XMLHttpRequest();

    xhr.onreadystatechange = function() {
        if (xhr.readyState < 4) return;

        // 서버의 응답상태가 200일 때만 작업을 수행한다.
        if (xhr.status != 200) {
            if (settings.error) { // settins 안에 error가 있다면
                settings.error(); // 호출해주고
            }
            return;
        }

        if (settings.success){ // 있다면 ( != undefined랑 같은말)
            if (settings.dataType == 'json') {
                settings.success(JSON.parse(xhr.responseText));
            } else {
                settings.success(xhr.responseText); // 호출해준다
            }
        }
    };
    if (settings.method.toUpperCase() == 'POST') {
        xhr.open(settings.method , url, true);
        xhr.setRequestHeader('Content-Type','application/x-www-form-urlencoded') // POST
        // 요청이라면
        // 리퀘스트헤더를
        // 설정해야한다.
        xhr.send(bit.toQueryString(settings.data));
    } else {
        xhr.open(settings.method, url + '?' + bit.toQueryString(settings.data), true);
        xhr.send();
    }
};

var $ = bit; // 걍 함수의 이름임 함수도 객체 ~

var str = "aaa bbb xxx ddd eee bbb xxx";
var x = str.split("bbb").join("zzz").toString(); // 3개의 배열 생김
console.log(x);

