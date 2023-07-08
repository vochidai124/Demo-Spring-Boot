// script.js
let btns = document.querySelectorAll("*[data-modal-btn]");

for (let i = 0; i < btns.length; i++) {
  btns[i].addEventListener('click', function () {
    let name = btns[i].getAttribute('data-modal-btn');
    let modal = document.querySelector("[data-modal-window='" + name + "']");
    modal.style.display = "block";
    let close = modal.querySelector(".close_modal_window");
    close.addEventListener('click', function () {
      modal.style.display = "none";
    });
  });
}

window.onclick = function (event) {
  if (event.target.hasAttribute('data-modal-window')) {
    let modals = document.querySelectorAll('*[data-modal-window]');
    for (let i = 0; i < modals.length; i++) {
      modals[i].style.display = "none";
    }
  }
}

// Thêm mã JavaScript cho bản đồ
function initMap() {
  // Tạo đối tượng bản đồ
  const map = new google.maps.Map(document.getElementById("map"), {
    center: { lat: 10.762622, lng: 106.660172 }, // Thay đổi tọa độ này thành tọa độ địa điểm của bạn
    zoom: 15, // Thay đổi mức độ phóng to/buộc nhỏ bản đồ
  });

  // Thêm đánh dấu vị trí của bạn
  const marker = new google.maps.Marker({
    position: { lat: 10.762622, lng: 106.660172 }, // Thay đổi tọa độ này thành tọa độ địa điểm của bạn
    map: map,
    title: "Địa chỉ của bạn",
  });
}