module.exports = {
    parser: "@typescript-eslint/parser",
    parserOptions: {
        sourceType: "module",
        project: "./tsconfig.json",
    },
    ignorePatterns: ['*.js'],
    extends: [
        "prettier",
        "plugin:prettier/recommended",
    ],
};