PDF & DOCX Converter + Blackjack Game
Overview
This project includes two main functionalities:
PDF Converter – Convert PDF files into plain text (.txt) or Word documents (.docx).
Blackjack Game – Play a simple console-based Blackjack game using the same deck and card structure.
PDF Converter
Features
Converts a PDF file into .txt and .docx simultaneously.
Handles multi-page PDFs.
Outputs files with UTF-8 encoding for proper character support.
Usage
Run the converter from the terminal:
python3 pdf_converter.py <input_pdf> <output_txt> <output_docx>
Example:
python3 pdf_converter.py example.pdf output.txt output.docx
Output:
output.txt – plain text version of your PDF
output.docx – Word document version of your PDF
Requirements:
Python 3.x
pdfplumber (pip install pdfplumber)
python-docx (pip install python-docx)
Blackjack Game
Features
Uses the same Deck and Card classes from the PDF project.
Plays a console-based Blackjack game with standard rules.
Dealer plays automatically; player chooses to hit or stand.
Usage
Run the game from the terminal:
javac Card.java Deck.java BlackjackGame.java
java BlackjackGame
Follow the prompts to play.
File Structure
/PDF_Converter_Project
│
├─ pdf_converter.py
├─ example.pdf
├─ requirements.txt
├─ Card.java
├─ Deck.java
└─ BlackjackGame.java
Notes
Ensure your PDF file exists in the same directory when running the converter.
The Blackjack game is console-based and uses standard input to play.
All code is compatible with Java 8+ for the game portion and Python 3.x for the converter.
