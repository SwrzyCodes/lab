def is_safe(board, row, col):
    for i in range(row):
        # Check column and diagonals
        if board[i] == col or \
           board[i] - i == col - row or \
           board[i] + i == col + row:
            return False
    return True

def solve_n_queens(board, row, N, solutions):
    if row == N:
        solutions.append(board[:])
        return

    for col in range(N):
        if is_safe(board, row, col):
            board[row] = col
            solve_n_queens(board, row + 1, N, solutions)

# Test
N = 8
board = [-1] * N
solutions = []
solve_n_queens(board, 0, N, solutions)

print(f"Total solutions for 8-Queens: {len(solutions)}")
print("First solution (column index per row):", solutions[0])