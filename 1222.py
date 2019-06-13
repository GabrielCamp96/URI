# MEU CÓDIGO QUE NÃO SEI PORQUE DÁ 5% WA.

while True:
    try:
        n, l, c = input().split()
        l = int(l)
        c = int(c)
        texto = input().split()
        i = 1
        while i < len(texto):
            texto.insert(i," ")
            i = i + 2   
        linhas = 1
        caracteres = 0
        for palavra in texto:
            if caracteres + len(palavra) <= c:
                caracteres = caracteres + len(palavra)
            else:
                if palavra == " ": continue
                caracteres = len(palavra)
                linhas = linhas + 1
            print(caracteres, linhas)
        if linhas % l == 0 or linhas < l: paginas = linhas // l
        else: paginas = linhas // l + 1 
        print(paginas)
    except EOFError:
        break

        from sys import stdin
from math import ceil


# CÓDIGO QUE RODOU https://github.com/angelgladin/URI/blob/master/1222.py

# def minimum_number_pages(story, max_lines, max_char):
# 	max_char_counter = 0
# 	pages = 0
# 	lines = 1
# 	for s in story.split():
# 		if len(s) + max_char_counter <= max_char:
# 			max_char_counter += len(s) + 1
# 		else:
# 			max_char_counter = 0
# 			max_char_counter += len(s) + 1
# 			lines += 1
# 	return ceil(lines/max_lines)

# while True:
# 	ln = stdin.readline().split()
# 	if not ln:
# 		break 
# 	n, max_lines, max_char = map(int, ln)
# 	story = stdin.readline()
# 	print(minimum_number_pages(story, max_lines, max_char))
