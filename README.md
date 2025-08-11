HTML Website Development — Complete Learning Guide
1. HTML Basics
<!DOCTYPE html> – Declares HTML5 document type.

<html> – Root element of an HTML document.

<head> – Contains metadata, title, styles, scripts.

<title> – Defines the page title.

<body> – Contains the main content.

Headings: <h1> to <h6>

Paragraphs: <p>

Line breaks: <br>

Horizontal rule: <hr>

2. Text Formatting
Bold: <b> or <strong>

Italic: <i> or <em>

Underline: <u>

Strikethrough: <s>

Subscript: <sub>

Superscript: <sup>

Blockquote: <blockquote>

3. Links & Navigation
<a href="URL"> – Hyperlinks.

Attributes:

target="_blank" → open in new tab

title → tooltip on hover

Linking email: mailto:email@example.com

4. Images
<img src="path" alt="description">

Attributes:

width & height

alt → accessibility text

5. Lists
Ordered list: <ol> + <li>

Unordered list: <ul> + <li>

Definition list: <dl>, <dt>, <dd>

6. Tables
<table> – main container

<tr> – table row

<td> – table data

<th> – table header

<thead>, <tbody>, <tfoot> – semantic grouping

Merging cells: colspan, rowspan

Styling: borders, spacing, padding via CSS

7. Forms
<form> – main container

Form elements:

<input> types: text, password, email, number, checkbox, radio, submit, reset, file, hidden

<textarea>

<select> + <option>

<button>

<label>

Form attributes:

action (URL to send data)

method (GET/POST)

required

placeholder

name, value

8. Media
Video:

html
Copy
Edit
<video controls>
  <source src="video.mp4" type="video/mp4">
</video>
Audio:

html
Copy
Edit
<audio controls>
  <source src="audio.mp3" type="audio/mpeg">
</audio>
YouTube Embed:

html
Copy
Edit
<iframe width="560" height="315" 
  src="https://www.youtube.com/embed/VIDEO_ID" 
  frameborder="0" allowfullscreen>
</iframe>
9. Iframes
<iframe src="URL"> – Embed another page/map/video

Attributes: width, height, frameborder, allowfullscreen

10. SEO (Search Engine Optimization)
On-page SEO:

Use meta tags (<meta name="description">)

Semantic tags (<header>, <nav>, <article>)

Heading hierarchy (<h1> → <h6>)

Alt text for images

Off-page SEO:

Backlinks from other sites

Social media sharing

Guest posting

Influencer mentions

11. Accessibility (A11Y)
Use alt attributes for images

Use ARIA roles and labels for assistive technologies

Ensure semantic HTML structure

Keyboard navigation support

12. HTML5 APIs & Features
Drag & Drop: Allows moving elements with mouse interaction.

Geolocation:

javascript
Copy
Edit
navigator.geolocation.getCurrentPosition((pos) => {
  console.log(pos.coords.latitude, pos.coords.longitude);
});
(Works only on secure HTTPS sites or localhost.)

Local Storage & Session Storage: Save data in browser.

Web Workers: Run scripts in background threads.

 With all these concepts, you can build fully functional, accessible, SEO-friendly, and interactive websites using just HTML (with CSS & JS for styling and behavior).
