var formObj = document.getElementById('register');
var errorMessageObj = document.getElementById('error_message');
formObj.onsubmit = function() {
  if (!formObj.tag.value ) {
    errorMessageObj.textContent = '１つ以上タグ付けしてください';
    return false;
  }
  if (!formObj.IMAGE.value) {
    errorMessageObj.textContent = '写真を挿入してください';
    return false;
  }

  errorMessageObj.textContent = null;
};

