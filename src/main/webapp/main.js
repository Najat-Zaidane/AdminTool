//Todo list
const inputBox=document.getElementById("input-box");
const listContainer=document.getElementById("list-container");

function  addTask(){
	if(inputBox.value === ''){
		alert("You must write something!");
	}
	else{
		let li = document.createElement("li");
		li.innerHTML = inputBox.value;
		listContainer.appendChild(li);
		let span = document.createElement("span");
		span.innerHTML = "\u00d7";
		li.appendChild(span);
	}
	inputBox.value = "";
	saveData()
}
listContainer.addEventListener("click", function(e){
	if(e.target.tagName === "LI"){
		e.target.classList.toggle("checked");
		saveData();
		//clearData();
	}
	else if(e.target.tagName === "SPAN"){
		e.target.parentElement.remove();
		saveData();
	    //clearData();
	} 
}, false);

// to save the tasks in the browser so they won't disapear after refreshing the page
 function saveData(){
	localStorage.setItem("data",listContainer.innerHTML);
}
function showTask(){
	listContainer.innerHTML = localStorage.getItem("data");
}
showTask();



//supplies list
const inputBox2=document.getElementById("input-box2");
const listContainer2=document.getElementById("list2-container");

function  addSupply(){
	if(inputBox2.value === ''){
		alert("You must write something!");
	}
	else{
		let li = document.createElement("li");
		li.innerHTML = inputBox2.value;
		listContainer2.appendChild(li);
		let span = document.createElement("span");
		span.innerHTML = "\u00d7";
		li.appendChild(span);
	}
	inputBox2.value = "";
	saveData2()
}
listContainer2.addEventListener("click", function(e){
	if(e.target.tagName === "LI"){
		e.target.classList.toggle("checked");
		saveData2();
		//clearData();
	}
	else if(e.target.tagName === "SPAN"){
		e.target.parentElement.remove();
		saveData2();
	    //clearData();
	} 
}, false);

// to save the tasks in the browser so they won't disapear after refreshing the page
 function saveData2(){
	localStorage.setItem("data2",listContainer2.innerHTML);
}
function showSupply(){
	listContainer2.innerHTML = localStorage.getItem("data2");
}
showSupply();


/*Function to clear the saved data
function clearData() {
	localStorage.removeItem('data');
  }*/
  
  /* Example usage of clearData
  var clearButton = document.getElementById('clearButton');
  clearButton.addEventListener('click', function() {
	clearData();
  });*/

  // Function to add an expense
function addExpense() {
	var expenseName = document.getElementById('expense-name').value;
	var expenseAmount = document.getElementById('expense-amount').value;
	var expenseCategory = document.getElementById('expense-category').value;
  
	// Create a new expense item
	var expenseItem = document.createElement('li');
	expenseItem.textContent = expenseName + ' - $' + expenseAmount + ' (' + expenseCategory + ')';
  
	// Append the new expense item to the expense list
	var expenseList = document.getElementById('expenses');
	expenseList.appendChild(expenseItem);
  
	// Clear the input fields
	document.getElementById('expense-name').value = '';
	document.getElementById('expense-amount').value = '';
	document.getElementById('expense-category').value = '';
  }

  // Function to clear the expense list
  function clearExpenses() {
	var expenseList = document.getElementById('expenses');
	expenseList.innerHTML = '';
}


//Invitation management

 // Function to handle the upload of user's own invitation
 function uploadInv() {

	var input = document.createElement('input');
	
	// Set attributes for the file input
	input.setAttribute('type', 'file');
	input.setAttribute('accept', 'image/*, application/pdf');
  
	// Add event listener to handle the file upload
	input.addEventListener('change', function(e) {

		var file = input.files[0]; // to access the uploaded file

		if (file) {
		  var reader = new FileReader();
	  
		  reader.onload = function(e) {
			var fileType = file.type;
			if (fileType.includes('image')) {
				// Create an image element and set the source to the uploaded image
				var img = document.createElement('img');
				img.src = e.target.result;
				
				// Append the image to the invitation container
				var invitContainer = document.getElementById('Invit-container');
				invitContainer.innerHTML = ''; // Clear any existing content
				invitContainer.appendChild(img);
			  } 

			  else if (fileType.includes('pdf')) {
				// Create an iframe element to embed the PDF
				var iframe = document.createElement('iframe');
				iframe.src = 'path/to/pdfjs-dist/web/viewer.html?file=C:\Users\Administrateur\Desktop\Eventify\pdfJsLib/pdf-master.pdf';
				//iframe.src = 'https://mozilla.github.io/pdf.js/web/viewer.html?file=' + encodeURIComponent(e.target.result);
				iframe.style.width = '100%';
				iframe.style.height = '700px';
		
				// Append the iframe to the invitation container
				var invitContainer = document.getElementById('Invit-container');
				invitContainer.innerHTML = ''; // Clear any existing content
				invitContainer.appendChild(iframe);
			  }
			};
	  
		  // Read the file as a data URL
		  reader.readAsDataURL(file);
		} 
	});
  
	// Trigger the file input click event
	input.click();
  }


//guests management
// Guest class
class Guest {
	constructor(name, email, notes) {
	  this.name = name;
	  this.email = email;
	  this.notes = notes;
	}
  }
  
  // Guest management functionality
  const guestList = [];
  
  const guestForm = document.getElementById('guest-form');
  const guestNameInput = document.getElementById('guest-name');
  const guestContactInput = document.getElementById('guest-contact');
  const guestEmailInput = document.getElementById('guest-email');
  const guestNotesInput = document.getElementById('guest-notes');
  const guestListContainer = document.getElementById('guest-list');
  
  guestForm.addEventListener('submit', function(event) {
	event.preventDefault();
	addGuest();
  });
  
  function addGuest() {
	const name = guestNameInput.value;
	const contact = guestContactInput.value;
	const email = guestEmailInput.value;
	const notes = guestNotesInput.value;
  
	const guest = new Guest(name, contact, email, notes);
	guestList.push(guest);
  
	displayGuests();
	clearForm();
  }
  
  function displayGuests() {
	guestListContainer.innerHTML = '';
  
	for (const guest of guestList) {
	  const guestItem = document.createElement('div');
	  guestItem.classList.add('guest-item');
	  guestItem.innerHTML = `
		<p>Name: ${guest.name}</p>
		<p>Contact: ${guest.contact}</p>
		<p>Email: ${guest.email}</p>
		<p>Notes: ${guest.notes}</p>
		<button onclick="removeGuest('${guest.email}')">Remove</button>
	  `;
	  guestListContainer.appendChild(guestItem);
	}
  }
  
  function removeGuest(email) {
	const index = guestList.findIndex(guest => guest.email === email);
	if (index !== -1) {
	  guestList.splice(index, 1);
	  displayGuests();
	}
  }
  
  function clearForm() {
	guestNameInput.value = '';
	guestContactInput.value = '';
	guestEmailInput.value = '';
	guestNotesInput.value = '';
  }
  
  



//slider d'images
var slideIndex = 1;
showSlides(slideIndex);
//slideInterval stocke l'ID de l'intervalle
var slideInterval = setInterval(function() { plusSlides(1) }, 5000); // Change image every 5 seconds

function plusSlides(n) {
 clearInterval(slideInterval); // Stop automatic sliding
 showSlides(slideIndex += n); 
 slideInterval = setInterval(function() { plusSlides(1) }, 5000); // Restart automatic sliding
}


function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("custom-slider");
  var dots =
  document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
} //fin slider 
//log form
const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});


//fin log form

(function($) {

	var	$window = $(window),
		$body = $('body'),
		$main = $('#main');

	// Breakpoints.
		breakpoints({
			xlarge:   [ '1281px',  '1680px' ],
			large:    [ '981px',   '1280px' ],
			medium:   [ '737px',   '980px'  ],
			small:    [ '481px',   '736px'  ],
			xsmall:   [ '361px',   '480px'  ],
			xxsmall:  [ null,      '360px'  ]
		});

	// Play initial animations on page load.
		$window.on('load', function() {
			window.setTimeout(function() {
				$body.removeClass('is-preload');
			}, 100);
		});

	// Nav.
		var $nav = $('#nav');

		if ($nav.length > 0) {

			// Shrink effect.
				$main
					.scrollex({
						mode: 'top',
						enter: function() {
							$nav.addClass('alt');
						},
						leave: function() {
							$nav.removeClass('alt');
						},
					});

			// Links.
				var $nav_a = $nav.find('a');

				$nav_a
					.scrolly({
						speed: 1000,
						offset: function() { return $nav.height(); }
					})
					.on('click', function() {

						var $this = $(this);

						// External link? Bail.
							if ($this.attr('href').charAt(0) != '#')
								return;

						// Deactivate all links.
							$nav_a
								.removeClass('active')
								.removeClass('active-locked');

						// Activate link *and* lock it (so Scrollex doesn't try to activate other links as we're scrolling to this one's section).
							$this
								.addClass('active')
								.addClass('active-locked');

					})
					.each(function() {

						var	$this = $(this),
							id = $this.attr('href'),
							$section = $(id);

						// No section for this link? Bail.
							if ($section.length < 1)
								return;

						// Scrollex.
							$section.scrollex({
								mode: 'middle',
								initialize: function() {

									// Deactivate section.
										if (browser.canUse('transition'))
											$section.addClass('inactive');

								},
								enter: function() {

									// Activate section.
										$section.removeClass('inactive');

									// No locked links? Deactivate all links and activate this section's one.
										if ($nav_a.filter('.active-locked').length == 0) {

											$nav_a.removeClass('active');
											$this.addClass('active');

										}

									// Otherwise, if this section's link is the one that's locked, unlock it.
										else if ($this.hasClass('active-locked'))
											$this.removeClass('active-locked');

								}
							});

					});

		}

	// Scrolly.
		$('.scrolly').scrolly({
			speed: 1000
		});

})(jQuery);

