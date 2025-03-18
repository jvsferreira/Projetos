morse_signals = {"A": "*-",
                 "B": "-***",
                 "C": "-*-*",
                 "D": "-**",
                 "E": "*",
                 "F": "**-*",
                 "G": "--*",
                 "H": "****",
                 "I": "**",
                 "J": "*---",
                 "K": "-*-",
                 "L": "*-**",
                 "M": "--",
                 "N": "-*",
                 "O": "---",
                 "P": "*--*",
                 "Q": "--*-",
                 "R": "*-*",
                 "S": "***",
                 "T": "-",
                 "U": "**-",
                 "V": "***-",
                 "W": "*--",
                 "X": "-**-",
                 "Y": "-*--",
                 "Z": "--**",
                 "1": "*----",
                 "2": "**---",
                 "3": "***--",
                 "4": "****-",
                 "5": "*****",
                 "6": "-****",
                 "7": "--***",
                 "8": "---**",
                 "9": "----*",
                 "0": "-----",
                 " ": "/"}

def encode_morse(text):
    morse_code = ""
    for char in text:
        if char.upper() in morse_signals:
            morse_code += morse_signals[char.upper()] + " "
    return morse_code

def decode_morse(morse_code):
    text = ""
    for word in morse_code.split():
        for char, signal in morse_signals.items():
            if word == signal:
                text += char
    return text

if __name__ == "__main__":
    text = "CODIGO MORSE EM PYTHON"
    morse_code = encode_morse(text)
    print(f"Text: {text}")
    print(f"Morse Code: {morse_code}")
    print(f"Decoded Text: {decode_morse(morse_code)}")
