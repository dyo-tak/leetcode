function canConstruct(ransomNote: string, magazine: string): boolean {
    const alphabets: number[] = Array(26).fill(0);

    for (const ch of magazine) {
        alphabets[ch.charCodeAt(0) - 'a'.charCodeAt(0)] += 1;
    }

    for (const ch of ransomNote) {
        alphabets[ch.charCodeAt(0) - 'a'.charCodeAt(0)] -= 1;
    }

    for (const i of alphabets) {
        if (i < 0) {
            return false;
        }
    }

    return true;
}