var formObj = document.getElementById('mypage_form');
var errorMessageObj = document.getElementById('error_message');
formObj.onsubmit = function() {
  if (!formObj.userid.value || !formObj.password.value || !formObj.name.value || !formObj.email.value || genderSelect.options[0].selected === true) {
    errorMessageObj.textContent = '必須項目を入力してください';
    return false;
  }
  errorMessageObj.textContent = null;
};



